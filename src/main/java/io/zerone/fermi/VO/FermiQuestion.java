package io.zerone.fermi.VO;

public class FermiQuestion {
	private int fermi_id; // fermi_seq
	private String fermi_title;
	private String fermi_question;
	private String fermi_regdate;
	private int fermi_like;

	public FermiQuestion() {
	}

	public FermiQuestion(int fermi_id, String fermi_title, String fermi_question, String fermi_regdate,
			int fermi_like) {
		this.fermi_id = fermi_id;
		this.fermi_title = fermi_title;
		this.fermi_question = fermi_question;
		this.fermi_regdate = fermi_regdate;
		this.fermi_like = fermi_like;
	}

	public int getFermi_id() {
		return fermi_id;
	}

	public void setFermi_id(int fermi_id) {
		this.fermi_id = fermi_id;
	}

	public String getFermi_title() {
		return fermi_title;
	}

	public void setFermi_title(String fermi_title) {
		this.fermi_title = fermi_title;
	}

	public String getFermi_question() {
		return fermi_question;
	}

	public void setFermi_question(String fermi_question) {
		this.fermi_question = fermi_question;
	}

	public String getFermi_regdate() {
		return fermi_regdate;
	}

	public void setFermi_regdate(String fermi_regdate) {
		this.fermi_regdate = fermi_regdate;
	}

	public int getFermi_like() {
		return fermi_like;
	}

	public void setFermi_like(int fermi_like) {
		this.fermi_like = fermi_like;
	}

	@Override
	public String toString() {
		return "FermiQuestion [fermi_id=" + fermi_id + ", fermi_title=" + fermi_title + ", fermi_question="
				+ fermi_question + ", fermi_regdate=" + fermi_regdate + ", fermi_like=" + fermi_like + "]";
	}
}
