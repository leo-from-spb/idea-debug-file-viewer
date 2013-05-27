package leofromspb.idea.debugFile;

import com.intellij.openapi.components.ProjectComponent;
import org.jetbrains.annotations.NotNull;

/**
 * @author Leonid Bushuev from JetBrains
 */
public class TheProjectComponent implements ProjectComponent
{

    @Override
    public void projectOpened() {
    }


    @Override
    public void projectClosed() {
    }


    @Override
    public void initComponent() {
    }


    @Override
    public void disposeComponent() {
    }


    @NotNull
    @Override
    public String getComponentName() {
        return "ComponentName";
    }
}
