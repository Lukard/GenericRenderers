/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lukard.renderers.sample.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lukard.renderers.RendererBuilder;
import com.lukard.renderers.sample.R;
import com.lukard.renderers.sample.model.RandomVideoCollectionGenerator;
import com.lukard.renderers.sample.model.Video;
import com.lukard.renderers.sample.ui.renderers.VideoRenderer;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * SimpleRecyclerViewActivity for the Renderers demo.
 *
 * @author alberto.ballano
 */
public class SimpleRecyclerViewActivity extends Activity {

    private static final int VIDEO_COUNT = 100;

    @BindView(R.id.rv_renderers)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Video> videoCollection = RandomVideoCollectionGenerator.generateList(VIDEO_COUNT);

        RendererBuilder.create(new VideoRenderer())
                .buildWith(videoCollection)
                .into(recyclerView);
    }
}
