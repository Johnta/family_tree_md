package k25.datle.familytree.types;

/**
 * Created by Nguyen on 9/2/2016.
 */

public class HierarchyMember extends Human {
    Relationship m_UpperRelation;
    Relationship m_LowerRelation;

    public HierarchyMember(HumanInfo info, Relationship upperRelation, Relationship lowerRelation) {
        m_Info          = info;

        if (upperRelation != null) {
            m_UpperRelation = upperRelation;
        }

        if (lowerRelation != null) {
            m_LowerRelation = lowerRelation;
        }
    }

    public Relationship GetUpperRelation() {
        return m_UpperRelation;
    }

    public Relationship GetLowerRelation() {
        return m_LowerRelation;
    }
}
