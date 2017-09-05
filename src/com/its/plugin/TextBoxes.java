package com.its.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * (c) 2016 Abhishek Aryan
 *
 * @author Abhishek Aryan
 * @since 9/5/2017.
 */
public class TextBoxes extends AnAction {
    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    public TextBoxes() {
        // Set the menu item name.
        super("Login");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showInputDialog(project, "Verify Yourself ?", "Enter Access Code", Messages.getQuestionIcon());

        if(txt!=null){

            Messages.showMessageDialog(project, "Hello, " + txt + "!\n I am glad to see you.", "Login Successful", Messages.getInformationIcon());
        }


    }
}