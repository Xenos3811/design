/**
 * @author xujiacong@ejiayou.com
 * @description 构建者模式
 * @create 2022-05-10 17:33
 **/
public class Build {

    public static void main(String[] args) {
        Build build1 = Build.builder().id("1000").name("小明").build();
        Build build2 = Build.builder().id("2000").name("小张").build();
        Build build3 = Build.builder().id("3000").name("小亮").build();

        System.out.println(build1.toString());
        System.out.println(build2.toString());
        System.out.println(build3.toString());
    }

    private String id;

    private String name;


    @Override
    public String toString() {
        return "Build{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {
        
        private String id;

        private String name;

        public Build build() {
            Build build = new Build();
            build.setId(id);
            build.setName(name);
            return build;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

    }
}
