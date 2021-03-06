/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red","weṭeṭṭi",R.drawable.color_red,R.color.category_colors,R.raw.color_red));
        colors.add(new Word("green","chokokki",R.drawable.color_green,R.color.category_colors,R.raw.color_green));
        colors.add(new Word("brown","ṭakaakki",R.drawable.color_brown,R.color.category_colors,R.raw.color_brown));
        colors.add(new Word("gray","ṭopoppi",R.drawable.color_gray,R.color.category_colors,R.raw.color_gray));
        colors.add(new Word("black","kululli",R.drawable.color_black,R.color.category_colors,R.raw.color_black));
        colors.add(new Word("white","kelelli",R.drawable.color_white,R.color.category_colors,R.raw.color_white));
        colors.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.color.category_colors,R.raw.color_dusty_yellow));
        colors.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.color.category_colors,R.raw.color_mustard_yellow));

        ListView listView = (ListView)findViewById(R.id.list);
        WordAdapter wordAdapter = new WordAdapter(this,colors);
        listView.setAdapter(wordAdapter);
    }
}
