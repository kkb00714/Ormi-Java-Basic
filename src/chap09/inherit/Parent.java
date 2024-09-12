package chap09.inherit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public abstract class Parent {
    abstract void method() throws IOException;
    abstract void method2() throws FileNotFoundException;
}
