package leofromspb.idea.debugFile;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;

/**
 * @author Leonid Bushuev from JetBrains
 */
public class DebugFileAction extends AnAction /*DebuggerActionHandler*/
{
    public DebugFileAction() {
        super();
    }


    @Override
    public void update(AnActionEvent e) {
        super.update(e);
        final Project project = e.getData(PlatformDataKeys.PROJECT);
        //e.getPresentation().setEnabled(project != null);
        e.getPresentation().setVisible(true);
        e.getPresentation().setEnabled(true);
    }


    @Override
    public void actionPerformed(AnActionEvent anActionEvent)
    {
        ;


    }

}
