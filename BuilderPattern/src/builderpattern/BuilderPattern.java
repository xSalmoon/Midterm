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
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MacBookPro_2018 macbookPro_2018 = new MacBookPro_2018();
        MacBookSeller macBookSeller = new MacBookSeller(macbookPro_2018);

        MacBookPro myMacbook= macBookSeller.lowSpec();

        System.out.println(myMacbook.toString());

        MacBookPro dreamMacbook = macbookPro_2018
                .buildCPU(new MacBookPro.Processor("2.9GHz 6 核心第八代 Intel Core i9 處理器"))
                .buildMemory(new MacBookPro.Memory(32))
                .buildStorage(new MacBookPro.Storage(4096))
                .buildKeyboard(new MacBookPro.Keyboard("英文"))
                .buildGraphics(new MacBookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .build();

        System.out.println(dreamMacbook.toString());
    }
    
}
