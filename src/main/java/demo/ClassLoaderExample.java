package demo;

public class ClassLoaderExample {

    //class loader concept
    public static void main(String[] args) {
        //string is loaded by bootstrap  classloader (return null)
        System.out.println(String.class.getClassLoader());

        //custom class is loaded by  application classloader
        System.out.println(ClassLoaderExample.class.getClassLoader());

        //parent of application  classloader --platform classloader
        System.out.println(ClassLoaderExample.class.getClassLoader().getParent());

        //parent of platform classloader -->bootstrap --(null)
        System.out.println(ClassLoaderExample.class.getClassLoader().getParent().getParent());
    }
}
