package com.example.listsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listsample.R.id;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // リストの入れ物作成
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        // リストに入れたいものを追加していく
        adapter.add("ベンジー");
        adapter.add("テリー");
        adapter.add("たっちゃん");
        adapter.add("ジョナサン");
        adapter.add("ジョセフ");
        adapter.add("承太郎");
        adapter.add("仗助");
        adapter.add("ジョルノ");
        adapter.add("徐倫");
        adapter.add("ジョニィ");
        adapter.add("定助");

        // リソース（XML）に定義したListViewを取得
        ListView listView = (ListView)findViewById(id.listview);

        // ListViewに上で作ったリストの入れ物（adapter）をセット
        listView.setAdapter(adapter);

        // アイテムをクリックされたときの挙動を指定する
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView) parent;
                String item = (String)listView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
            }
        });
    }
}
