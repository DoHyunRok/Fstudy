package kr.co.fstudy.BoardVO;

public class BoardVO {
	int seq;
	String title;
	String content;
	String regdate;
	int cnt;
	int check;
	int commentcheck;
	String category;
	String categorysub;
	public BoardVO(int seq, String title, String content, String regdate, int cnt, int check, int commentcheck,
			String category, String categorysub) {
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.cnt = cnt;
		this.check = check;
		this.commentcheck = commentcheck;
		this.category = category;
		this.categorysub = categorysub;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public int getCommentcheck() {
		return commentcheck;
	}
	public void setCommentcheck(int commentcheck) {
		this.commentcheck = commentcheck;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategorysub() {
		return categorysub;
	}
	public void setCategorysub(String categorysub) {
		this.categorysub = categorysub;
	}
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", content=" + content + ", regdate=" + regdate + ", cnt="
				+ cnt + ", check=" + check + ", commentcheck=" + commentcheck + ", category=" + category
				+ ", categorysub=" + categorysub + "]";
	}
	
}
