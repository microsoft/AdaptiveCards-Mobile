// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package io.adaptivecards.renderer;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;

import io.adaptivecards.objectmodel.BaseActionElementVector;
import io.adaptivecards.objectmodel.HostConfig;

public interface IActionLayoutRenderer {
    public View renderActions(RenderedAdaptiveCard renderedCard,
                              Context context,
                              FragmentManager fragmentManager,
                              ViewGroup viewGroup,
                              BaseActionElementVector baseActionElementList,
                              ChannelAdaptor channelAdaptor,
                              HostConfig hostConfig,
                              RenderArgs renderArgs) throws AdaptiveFallbackException;
}
