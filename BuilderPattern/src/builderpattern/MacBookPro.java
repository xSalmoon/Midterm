/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author pushg
 */
public class MacBookPro {
    
    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Graphics graphics;
    private Keyboard keyboard;

    MacBookPro(){}

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "{ Macbook : " + "\n" +
                "Processor : " + this.getProcessor().name + "\n" +
                "Memory size : " + this.getMemory().size + "GB" + "\n" +
                "Graphics : " + this.getGraphics().name + "\n" +
                "Storage size : " + this.getStorage().size + "GB" +"\n" +
                "Keyboard language : "+ this.getKeyboard().language +
                " }";
    }

    public static class Processor{
        String name;
        Processor(String name){
            this.name = name;
        }
    }

    public static class Memory{
        int size;
        Memory(int size){
            this.size = size;
        }
    }

    public static class Graphics{
        String name;
        Graphics(String name){
            this.name = name;
        }
    }

    public static class Storage{

        int size;

        Storage(int size){
            this.size = size;
        }

    }
    public static class Keyboard{

        String language;

        Keyboard(String language){
            this.language = language;
        }

    }
}
