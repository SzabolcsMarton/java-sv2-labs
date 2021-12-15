package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        Plan planOne = new SketchPlan(5,"Terv");
        System.out.println(planOne.getPagesOfDocumentation());

        Plan planTwo = new PermitPlan(5,"Terv","SanyiBacsi","Budapest");
        System.out.println(planTwo.getPagesOfDocumentation());

        Plan planThree = new ConstructionPlan(5,"Terv",
                "SanyiBacsi","Budapest",10);
        System.out.println(planThree.getPagesOfDocumentation());


        SketchPlan sketchPlanOne = new SketchPlan(5,"Terv");
        System.out.println(sketchPlanOne.getTitle());
        System.out.println(sketchPlanOne.getPagesOfDocumentation());

        SketchPlan sketchPlanTwo = new PermitPlan(5,"Terv",
                "SanyiBacsi", "Budapest");
        System.out.println(sketchPlanTwo.getTitle());
        System.out.println(sketchPlanTwo.getPagesOfDocumentation());

        SketchPlan sketchPlanThree = new ConstructionPlan(5,"Terv",
                "SanyiBacsi","Budapest",10);
        System.out.println(sketchPlanThree.getTitle());
        System.out.println(sketchPlanThree.getPagesOfDocumentation());


        Header headerOne = new PermitPlan(5,"Terv","SanyiBacsi","Budapest");
        System.out.println(headerOne.getNameOfClient());
        System.out.println(headerOne.getAddressOfBuilding());

        Header headerTwo = new ConstructionPlan(5,"Terv",
                "SanyiBacsi","Budapest",10);
        System.out.println(headerTwo.getNameOfClient());
        System.out.println(headerTwo.getAddressOfBuilding());


        PermitPlan permitPlanOne = new PermitPlan(5,"Terv","SanyiBacsi",
                "Budapest");
        System.out.println(permitPlanOne.getHeader());
        System.out.println(permitPlanOne.getNameOfClient());
        System.out.println(permitPlanOne.getAddressOfBuilding());
        System.out.println(permitPlanOne.getTitle());
        System.out.println(permitPlanOne.getPagesOfDocumentation());

        PermitPlan permitPlanTwo = new ConstructionPlan(5,"Terv",
                "SanyiBacsi","Budapest",10);
        System.out.println(permitPlanTwo.getHeader());
        System.out.println(permitPlanTwo.getNameOfClient());
        System.out.println(permitPlanTwo.getAddressOfBuilding());
        System.out.println(permitPlanTwo.getTitle());
        System.out.println(permitPlanTwo.getPagesOfDocumentation());


        ConstructionPlan constructionPlan = new ConstructionPlan(5,"Terv",
                "SanyiBacsi","Budapest",10);
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan.getPagesOfDocumentation());


    }
}
