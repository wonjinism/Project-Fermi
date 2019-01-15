package io.zerone.fermi.VO;

public class FermiAnswer {
	private int answer_id; // answer_seq
	private String user_id;
	private int fermi_id;
	private String answer_content;
	private String answer_regdate;
	private int answer_like;

	public FermiAnswer() {
	}

	public FermiAnswer(int answer_id, String user_id, int fermi_id, String answer_content, String answer_regdate,
			int answer_like) {
		this.answer_id = answer_id;
		this.user_id = user_id;
		this.fermi_id = fermi_id;
		this.answer_content = answer_content;
		this.answer_regdate = answer_regdate;
		this.answer_like = answer_like;
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getFermi_id() {
		return fermi_id;
	}

	public void setFermi_id(int fermi_id) {
		this.fermi_id = fermi_id;
	}

	public String getAnswer_content() {
		return answer_content;
	}

	public void setAnswer_content(String answer_content) {
		this.answer_content = answer_content;
	}

	public String getAnswer_regdate() {
		return answer_regdate;
	}

	public void setAnswer_regdate(String answer_regdate) {
		this.answer_regdate = answer_regdate;
	}

	public int getAnswer_like() {
		return answer_like;
	}

	public void setAnswer_like(int answer_like) {
		this.answer_like = answer_like;
	}

	@Override
	public String toString() {
		return "FermiAnswer [answer_id=" + answer_id + ", user_id=" + user_id + ", fermi_id=" + fermi_id
				+ ", answer_content=" + answer_content + ", answer_regdate=" + answer_regdate + ", answer_like="
				+ answer_like + "]";
	}
}
