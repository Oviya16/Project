package com.shipmanagementsystem.model;



/**
 * The Class FeedbackQuestionsModel.
 */
public class FeedbackQuestionsModel {
	
		/** The q id. */
		private int qId;
		
		/** The ques 1. */
		private String ques1;
		
		/** The ques 2. */
		private String ques2;
		
		/** The ques 3. */
		private String ques3;

		/**
		 * Gets the q id.
		 *
		 * @return the q id
		 */
		public int getqId() {
			return qId;
		}

		/**
		 * Sets the q id.
		 *
		 * @param qId the new q id
		 */
		public void setqId(int qId) {
			this.qId = qId;
		}

		/**
		 * Gets the ques 1.
		 *
		 * @return the ques 1
		 */
		public String getQues1() {
			return ques1;
		}

		/**
		 * Sets the ques 1.
		 *
		 * @param ques1 the new ques 1
		 */
		public void setQues1(String ques1) {
			this.ques1 = ques1;
		}

		/**
		 * Gets the ques 2.
		 *
		 * @return the ques 2
		 */
		public String getQues2() {
			return ques2;
		}

		/**
		 * Sets the ques 2.
		 *
		 * @param ques2 the new ques 2
		 */
		public void setQues2(String ques2) {
			this.ques2 = ques2;
		}

		/**
		 * Gets the ques 3.
		 *
		 * @return the ques 3
		 */
		public String getQues3() {
			return ques3;
		}

		/**
		 * Sets the ques 3.
		 *
		 * @param ques3 the new ques 3
		 */
		public void setQues3(String ques3) {
			this.ques3 = ques3;
		}

		/**
		 * Instantiates a new feedback questions model.
		 *
		 * @param qId the q id
		 * @param ques1 the ques 1
		 * @param ques2 the ques 2
		 * @param ques3 the ques 3
		 */
		public FeedbackQuestionsModel(int qId, String ques1, String ques2, String ques3) {
			super();
			this.qId = qId;
			this.ques1 = ques1;
			this.ques2 = ques2;
			this.ques3 = ques3;
		}

		/**
		 * Instantiates a new feedback questions model.
		 */
		public FeedbackQuestionsModel() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}

