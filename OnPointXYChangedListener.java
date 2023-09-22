package olesia.shevtsova403_lab25.graphs;

import java.util.List;

import olesia.shevtsova403_lab25.graphs.model.LinkItem;
import olesia.shevtsova403_lab25.graphs.model.NodeItem;

public interface OnPointXYChangedListener {

    void onXYChanged(NodeItem newNode, List<LinkItem> newLinks);
}