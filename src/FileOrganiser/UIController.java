package FileOrganiser;

import javax.swing.*;

public class UIController {

    DirectoryNavigator model;
    UIForm view;
    JTable jtable;

    public UIController(DirectoryNavigator model, UIForm view) {
        this.model = model;
        this.view = view;

        createActionListenerForTable();
    }

    private void setupModel()
    {
    }

    private void createActionListenerForTable()
    {
        jtable = view.getTable();
        NavigationListener listener = new NavigationListener(this);
        jtable.getSelectionModel().addListSelectionListener(listener);
        jtable.addMouseListener(listener);

        view.setTable(jtable);
        view.updateTableFields(model.getCurrentDirectory());
    }


}
