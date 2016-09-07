package k25.datle.familytree.types;
import android.content.Context;

import java.util.Vector;

/**
 * Created by Nguyen on 9/2/2016.
 */

public class HierarchyTree {
    private Vector<HierarchyMember> m_MemberList;
    private Context m_Context;

    public HierarchyTree(Vector<HierarchyMember> memberList, Context ctx) {
        m_MemberList = memberList;
        m_Context    = ctx;
    }

    public void AddMember(HierarchyMember member){
        m_MemberList.add(member);
    }

    public void DrawTree(Context ctx) {
        //TODO draw tree to View
    }

}
