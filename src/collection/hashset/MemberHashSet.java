package collection.hashset;

import collection.Member;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                ir.remove();
                return true;
            }
        }
        System.out.println(memberId + "존재 하지않습니다");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}