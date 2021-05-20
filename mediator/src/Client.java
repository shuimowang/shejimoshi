public class Client {
	public static void main(String args[]) {
		AbstractChatroom happyChat=new ChatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamondMember("赵一");
		member2=new DiamondMember("钱二");
		//钻石会员
		member3=new CommonMember("孙三");
		member4=new CommonMember("李四");
		//普通会员

		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		//加入聊天室

		member1.sendText("孙三","孙三妹妹，你知道今天是什么日子吗？");
		member3.sendText("赵一","赵一哥，不要卖关子了，人家不知道");
		member4.sendText("孙三","孙三妹妹，今天是世界植树日");
		member1.sendImage("孙三","赵一在荒山种树");
		member2.sendImage("赵一","佩服");
		member3.sendText("赵一","哥哥好厉害，而且很有环保意识呢");
		member1.sendText("孙三","妹妹赞缪了，要不要一起来种树，我指导你呀");
		member3.sendText("赵一","好呀。不过我笨手笨脚的，要多帮帮人家");
	}
}