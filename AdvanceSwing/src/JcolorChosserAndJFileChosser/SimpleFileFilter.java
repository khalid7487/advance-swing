package JcolorChosserAndJFileChosser;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class SimpleFileFilter extends FileFilter {

    String[] etensions;
    String description;

    public SimpleFileFilter(String ext) {
        this(new String[]{ext}, null);
    }

    public SimpleFileFilter(String[] exts, String descr) {
        //Clone and lowercase the extensions
        etensions = new String[exts.length];
        for (int i = exts.length - 1; i >= 0; i--) {
            etensions[i] = exts[i].toLowerCase();
        }
        //make sure we have a valid (if simplistic) description
        description = (descr == null ? exts[0] + "files" : descr);
    }

    @Override
    public boolean accept(File f) {
        //we always allow directories, regardless of their extension
        if (f.isDirectory()) {return true;}
        
        //ok,it's a regular files, so the check the extension
        String name=f.getName().toLowerCase();
        for(int i =etensions.length-1;i>=0;i--){
            if(name.endsWith(etensions[i])){
                return true;
            }
        }
        return false;
    }

    @Override
  public String getDescription(){return description;}

}
