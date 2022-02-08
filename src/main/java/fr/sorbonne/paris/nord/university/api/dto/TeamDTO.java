package fr.sorbonne.paris.nord.university.api.dto;

import lombok.Data;

@Data
	public class TeamDTO {
		
		private long id;
		private String name;
		private String slogan;

		public TeamDTO() {

		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSlogan() {
			return slogan;
		}
		public void setSlogan(String slogan) {
			this.slogan = slogan;
		}
}


