package olesia.shevtsova403_lab25.graphs;

import java.util.ArrayList;

import olesia.shevtsova403_lab25.graphs.model.NodeItem;

public class NodeList {
    int selected_item = -1;
    int next_id = 1;
    ArrayList<NodeItem> list = new ArrayList<>();

    public void addNode (float x, float y) {
        NodeItem n = new NodeItem(next_id, x, y, "node" + String.valueOf(next_id));
        list.add(n);
        next_id++;
    }

    public void deleteSelectedNode() {
        if(selected_item < 0) return;
        list.remove(selected_item);
        selected_item = -1;
    }

    public void clear() {
        list.clear();
    }
}
