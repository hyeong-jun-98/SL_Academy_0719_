package member;

public class play {//

	public static void main(String[] args) {
		
		 Member m1 = new Member();
	        Member m2 = new Member();
	        Member m3 = new Member();
	        Member[] m_box = new Member[2];

	        String tmpName = null;

	        m_box[0] = m1;
	        m_box[1] = m2;
	        m_box[2] = m3;

	        for (int i = 0; i < m_box.length; i++) {
	            m_box[i].setMemberInfo();
	            tmpName = m_box[i].getMemberName();
	            System.out.println("��ȯ�� �̸� : " + tmpName);
	            m_box[i].putMemberInfo();
	        }
	    }
	
		
		
		
		
		
		
		
		
		
//
//		m.setMemberInfo();
//		m.getMemberName();
//		String tmpName = m.getMemberName();
//		String tmpId = m.getMemberId();
//		String tmpPass = m.getMemberPass();
//		String tmpPhone = m.getMemberPhone();
//		System.out.print(tmpName + " " + tmpId + " " + tmpPass + " " + tmpPhone);
//		m.putMemberInfo();
//		
		

	}

