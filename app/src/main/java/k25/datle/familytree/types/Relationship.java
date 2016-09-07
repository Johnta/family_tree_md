package k25.datle.familytree.types;

/**
 * Created by Nguyen on 9/2/2016.
 */

public class Relationship {
    Human    m_Target;
    String   m_RelationType;

    public Relationship(Human target, String relationType) {
        m_Target = target;
        m_RelationType = relationType;
    }
}
