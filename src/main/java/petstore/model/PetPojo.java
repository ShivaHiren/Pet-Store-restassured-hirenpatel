package petstore.model;

public class PetPojo {
    private Tags tags;
    private Breed breed;

    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Breed{
        private String name;
        private String photoUrls;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhotoUrls(String s) {
            return photoUrls;
        }

        public void setPhotoUrls(String photoUrls) {
            this.photoUrls = photoUrls;
        }
    }

    public static class Tags{
        private String name;
        private int status;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }


}
