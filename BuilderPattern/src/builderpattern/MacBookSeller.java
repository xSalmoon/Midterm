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
public class MacBookSeller {
     private MacBookProBuilder macbookProBuilder;

    MacBookSeller(MacBookProBuilder macbookProBuilder){

        this.macbookProBuilder = macbookProBuilder;
    }


    public MacBookPro lowSpec(){
        return macbookProBuilder
                .buildCPU(new MacBookPro.Processor("2.2GHz 6 核心第八代 Intel Core i7 處理器"))
                .buildMemory(new MacBookPro.Memory(16))
                .buildGraphics(new MacBookPro.Graphics("Radeon Pro 555X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacBookPro.Storage(256))
                .buildKeyboard(new MacBookPro.Keyboard("中文注音"))
                .build();
    }

    public MacBookPro highSpec(){
        return macbookProBuilder
                .buildCPU(new MacBookPro.Processor("2.6GHz 6 核心第八代 Intel Core i7 處理器"))
                .buildMemory(new MacBookPro.Memory(16))
                .buildGraphics(new MacBookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacBookPro.Storage(512))
                .buildKeyboard(new MacBookPro.Keyboard("中文注音"))
                .build();
    }
}
