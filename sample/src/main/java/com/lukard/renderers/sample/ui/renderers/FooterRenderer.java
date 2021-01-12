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
package com.lukard.renderers.sample.ui.renderers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lukard.renderers.sample.R;

import butterknife.ButterKnife;

/**
 * Abstract class that works as base renderer for Renderer<Video>. This class implements the main
 * render algorithm and declare some abstract methods to be implemented by subtypes.
 *
 * @author alberto.ballano
 */
public class FooterRenderer extends SectionRenderer2 {

    /**
     * Inflate the main layout used to render videos in the list view.
     *
     * @param inflater LayoutInflater service to inflate.
     * @param parent ViewGroup used to inflate xml.
     * @return view inflated.
     */
    @Override
    protected View inflate(LayoutInflater inflater, ViewGroup parent) {
        View inflatedView = inflater.inflate(R.layout.footer_renderer, parent, false);
        /*
         * You don't have to use ButterKnife library to implement the mapping between your layout
         * and your widgets you can implement setUpView and hookListener methods declared in
         * Renderer<T> class.
         */
        ButterKnife.bind(this, inflatedView);
        return inflatedView;
    }
}
