public class Params {
     private int owner_id;
     private int creator_id;
     private String date_due;
     private String description;
     private  int category_id;
     private int score;
     private String title;
     private int project_id;
     private String color_id;
     private int column_id;

     public Params(){

     }


    public static class Builder{
        private Params params;
        private int owner_id;
        private int creator_id;
        private String date_due;
        private String description;
        private  int category_id;
        private int score;
        private String title;
        private int project_id;
        private String color_id;
        private int column_id;

        public Builder() {
            params = new Params();
        }

        public Builder owner_id(int owner_id){
            params.owner_id = owner_id;
            return this;
        }

        public Builder creator_id(int creator_id){
            params.creator_id = creator_id;
            return this;
        }
        public Builder date_due(String date_due){
            params.date_due = date_due;
            return this;
        }
        public Builder description(String description){
            params.description = description;
            return this;
        }
        public Builder category_id(int category_id){
            params.category_id = category_id;
            return this;
        }
        public Builder score(int score){
            params.score = score;
            return this;
        }
        public Builder title(String title){
            params.title = title;
            return this;
        }
        public Builder project_id(int project_id){
            params.project_id = project_id;
            return this;
        }

        public Builder color_id(String color_id){
            params.color_id = color_id;
            return this;
        }

        public Builder column_id(int column_id){
            params.column_id = column_id;
            return this;
        }

        public Params build(){
            return params;
        }


    }
}
