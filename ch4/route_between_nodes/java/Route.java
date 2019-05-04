public class Route{
    public static void main(String[] args){
        Graph g = new Graph(4);
        g.addNode(42); g.addNode(666); g.addNode(123); g.addNode(1024);
        g.addNode(1); g.addNode(474); g.addNode(77); g.addNode(555);
        g.addNode(77); g.addNode(53); g.addNode(36); g.addNode(900);
        g.getNode(42).addChild(g.getNode(666));
        g.getNode(42).addChild(g.getNode(77));
        g.getNode(42).addChild(g.getNode(900));
        g.getNode(1).addChild(g.getNode(77));
        g.getNode(123).addChild(g.getNode(4));
        g.getNode(4).addChild(g.getNode(666));
        g.getNode(666).addChild(g.getNode(474));
        g.getNode(474).addChild(g.getNode(555));
        boolean can = g.route(g.getNode(123), g.getNode(1));
        System.out.println(can);
        can = g.route(g.getNode(42), g.getNode(900));
        System.out.println(can);
        can = g.route(g.getNode(123), g.getNode(555));
        System.out.println(can);
    }
}
