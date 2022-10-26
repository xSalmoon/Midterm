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
public class MacBookPro_2018 extends MacBookProBuilder{
    @Override
    MacBookPro build() {
        return super.build();
    }

    MacBookPro_2018() {
        super();
    }

    @Override
    MacBookProBuilder buildCPU(MacBookPro.Processor processor) {
        this.macbookPro.setProcessor(processor);
        return this;
    }

    @Override
    MacBookProBuilder buildMemory(MacBookPro.Memory size) {
        this.macbookPro.setMemory(size);
        return this;
    }

    @Override
    MacBookProBuilder buildGraphics(MacBookPro.Graphics name) {
        this.macbookPro.setGraphics(name);
        return this;
    }

    @Override
    MacBookProBuilder buildStorage(MacBookPro.Storage size) {
        this.macbookPro.setStorage(size);
        return this;
    }

    @Override
    MacBookProBuilder buildKeyboard(MacBookPro.Keyboard language) {
        this.macbookPro.setKeyboard(language);
        return this;
    }
}
