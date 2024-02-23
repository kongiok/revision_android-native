#   Android Native Revision #

##  Adapter ##

> UI 及 資料的插座

當我們要顯示資料時，少不免需要將資料轉換為 UI 元素。
這時便可利用 Adapter 將資料轉換為 TextView、ImageView 等 UI 元素。

此外，Adapter 還可以監控資料的變化，當資料更新時，Adapter 會通知 UI 進行更新，確保 UI 顯示的資料是最新的。


### Sample Code ###

如需求所述，我們使用Array Adapter進行資料控管。

```java
class MainActivity {
    ArrayAdapter listAdapter = new ArrayAdapter(this,
                                   android.R.layout.simple_list_item_1,
                                   cities);
}
```

`android.R.layout.simple_list_item_1`只是為了給你預設的顯示Styling而已。
Array Adapter有了，該讓資料送上 UI 去了，於是我們要指定哪個View要做更動。

```java
class MainActivity {
    ListView listView = findViewById(R.id.List);
    listView.setAdapter(listAdapter);
}
```
我們在xml中設置了名為 List 的 List View ，並且使用`setAdapter`進行綁定。

```java
class MainActivity {
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String currentCity = cities[position];
            String resultText = "You've chosen " + currentCity + " .";
            Toast.makeText(MainActivity.this,resultText, Toast.LENGTH_LONG).show();
        }
    });
}
```

最後，我們使用Callback Function進行內容物監聽。
請注意：我們使用的是`setOnItemClickListener`，在下在這裏摔了好大一跤，Debug 了好一段時間。