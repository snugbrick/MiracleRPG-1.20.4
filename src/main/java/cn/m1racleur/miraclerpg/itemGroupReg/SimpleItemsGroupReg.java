package cn.m1racleur.miraclerpg.itemGroupReg;

import cn.m1racleur.miraclerpg.BlocksReg.OreBlock;
import cn.m1racleur.miraclerpg.itemRegister.OtherSwords;
import cn.m1racleur.miraclerpg.itemRegister.SimpleItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.lang.reflect.Field;
import java.util.logging.Logger;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 15:18
 */
public class SimpleItemsGroupReg {
    public static final Class<SimpleItem> ItemsClass = SimpleItem.class;
    public static final Field[] ItemsField = ItemsClass.getDeclaredFields();
    public static final Item[] simpleItems = new Item[ItemsField.length];

    public static void pullFieldInItem(){//将类中的域压入数组
        for (Field field : ItemsField) {
            try {
                field.setAccessible(true);
                for (int i = 0; i < ItemsField.length; i++) {
                    simpleItems[i] = (Item) ItemsField[i].get(ItemsClass);
                }
            } catch (IllegalAccessException | IllegalStateException e) {
                Logger.getGlobal().severe("非法访问异常或非法状态异常出现在存储类中的域时");
                Logger.getGlobal().info(e.getMessage());
            }
        }
    }
    public static final Class<OtherSwords> otherSwords = OtherSwords.class;
    public static final Field[] swordsField = otherSwords.getDeclaredFields();
    public static final Item[] swords = new Item[swordsField.length];

    public static void pullFieldInSword(){//将类中的域压入数组
        for (Field field : swordsField) {
            try {
                field.setAccessible(true);
                for (int i = 0; i < swordsField.length; i++) {
                    swords[i] = (Item) swordsField[i].get(otherSwords);
                }
            } catch (IllegalAccessException | IllegalStateException e) {
                Logger.getGlobal().severe("非法访问异常或非法状态异常出现在存储类中的域时");
                Logger.getGlobal().info(e.getMessage());
            }
        }
    }

    public static final Class<OreBlock> blocks = OreBlock.class;
    public static final Field[] blocksDeclaredFields = blocks.getDeclaredFields();
    public static final Block[] Blocks = new Block[blocksDeclaredFields.length];

    public static void pullFieldInBlocks(){//将类中的域压入数组
        for (Field field : blocksDeclaredFields) {
            try {
                field.setAccessible(true);
                for (int i = 0; i < blocksDeclaredFields.length; i++) {
                    Blocks[i] = (Block) blocksDeclaredFields[i].get(blocks);
                }
            } catch (IllegalAccessException | IllegalStateException e) {
                Logger.getGlobal().severe("非法访问异常或非法状态异常出现在存储类中的域时");
                Logger.getGlobal().info(e.getMessage());
            }
        }
    }

}
