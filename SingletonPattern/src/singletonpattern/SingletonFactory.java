/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author pushg
 */
public class SingletonFactory {
    public static Factory getColaFactory(){
        return ColaFactory.colaFactory;
    }

    public static Factory getHumbergerFactory(){
        return HumbergerFactory.humbergerFactory;
    }


    private static class ColaFactory implements Factory{

        private static ColaFactory colaFactory = new ColaFactory();

        private ColaFactory(){}

        @Override
        public Product getProduct() {
            return new Cola();
        }
    }

    private static class HumbergerFactory implements Factory{

        private static HumbergerFactory humbergerFactory = new HumbergerFactory();

        private HumbergerFactory(){}

        @Override
        public Product getProduct() {
            return new Humberger();
        }
    }
}
