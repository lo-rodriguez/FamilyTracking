package net.ronasoft.familytracking.commons;

import com.google.common.reflect.ClassPath;
import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;
import net.ronasoft.familytracking.Models.ActiveBudget;


import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by User on 7/25/13.
 */
public class DatabaseConfigUtil extends OrmLiteConfigUtil {
    /*private static final Class<?>[] classes = new Class[]{
            RecordedSound.class,
    };
*/

    public static void main(String[] args) throws IOException, SQLException {
       /* Reflections reflections = new Reflections("my.project.prefix");
        writeConfigFile("ormlite_config.txt", classes );
        ClassPath classPath = ClassPath.from(Thread.currentThread().getContextClassLoader());
        classPath.classPath*/
        //D:\LRO\Familybudgettracking\app\src\main\res\raw\
        writeConfigFile("ormlite_config.txt", ActiveBudget.class.getClasses());
    }
}
