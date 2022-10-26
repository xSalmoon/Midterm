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
public abstract class MacBookProBuilder {
    protected MacBookPro macbookPro;

    MacBookProBuilder(){
        macbookPro = new MacBookPro();
    }

    abstract MacBookProBuilder buildCPU(MacBookPro.Processor processor);

    abstract MacBookProBuilder buildMemory(MacBookPro.Memory size);

    abstract MacBookProBuilder buildGraphics(MacBookPro.Graphics name);

    abstract MacBookProBuilder buildStorage(MacBookPro.Storage size);

    abstract MacBookProBuilder buildKeyboard(MacBookPro.Keyboard language);

    MacBookPro build(){
        return macbookPro;
    }
}
