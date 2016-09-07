package k25.datle.familytree.types;

/**
 * Created by Nguyen on 9/2/2016.
 */

public class HumanInfo {
    private String m_Address;
    private String m_Name;
    private int    m_Age;

    public HumanInfo(String address, String name, int age) {
        m_Address = address;
        m_Name    = name;
        m_Age     = age;
    }

    public String getAddress() {
        return m_Address;
    }

    public String getName() {
        return m_Name;
    }

    public int getAge() {
        return m_Age;
    }
}
