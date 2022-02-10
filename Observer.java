public interface Observer {
	public void update(NewsItem n);  //push variant
	void registerChannel(Channel c);
}
