import requests
import pandas as pd

url = "https://shopee.co.id/search?keyword=headset"

params = {
    "by": "relevancy",
    "keyword": "headset",
    "limit": 20,
    "newest": 0,
    "order": "desc",
    "page_type": "search",
    "scenario": "PAGE_GLOBAL_SEARCH",
    "version": 2
}

headers = {
    "User-Agent": "Mozilla/5.0",
}

response = requests.get(url, params=params, headers=headers)
data = response.json()

items = data["items"]

results = []

for item in items:
    name = item["item_basic"]["name"]
    price = item["item_basic"]["price"] / 100000
    sold = item["item_basic"]["sold"]
    rating = item["item_basic"]["item_rating"]["rating_star"]

    results.append([name, price, sold, rating])

df = pd.DataFrame(results, columns=["Nama Produk", "Harga", "Terjual", "Rating"])

print(df)

df.to_csv("data_shopee.csv", index=False)