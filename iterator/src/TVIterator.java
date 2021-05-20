public interface TVIterator {
	//抽象迭代器
	void setChannel(int i);
	void next();
	void previous();
	boolean isLast();
	Object currentChannel();
    boolean isFirst();
}