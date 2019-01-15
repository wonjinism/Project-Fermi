CREATE SEQUENCE user_seq;

CREATE TABLE user_info (
user_seq NUMBER
, user_id VARCHAR2(20) PRIMARY KEY
, user_password VARCHAR(20)
, user_regdate DATE
, user_level NUMBER(1) DEFAULT 1
);

CREATE SEQUENCE fermi_seq;

CREATE TABLE fermi_question (
fermi_id NUMBER PRIMARY KEY
, fermi_title VARCHAR2(100)
, fermi_question VARCHAR2(2000)
, fermi_regdate DATE
, fermi_like NUMBER DEFAULT 0
);

CREATE SEQUENCE answer_seq;

CREATE TABLE fermi_answer (
answer_id NUMBER PRIMARY KEY
, user_id VARCHAR2(20) REFERENCES user_info
, fermi_id NUMBER REFERENCES fermi_question
, answer_content VARCHAR2(1000)
, answer_regdate DATE
, answer_like NUMBER DEFAULT 0
);


update user_info set user_level = 0 where user_id = 'admin';
select * from user_info;
select * from fermi_question;

commit;


		INSERT INTO fermi_question
		(
			fermi_id
			, fermi_title
			, fermi_question
			, fermi_regdate
			, fermi_like
		) VALUES (
			fermi_seq.nextval
			, #{fermi_title}
			, #{fermi_question}
			, SYSDATE
			, 0
		)