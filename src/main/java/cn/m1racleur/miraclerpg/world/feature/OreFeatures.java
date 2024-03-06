package cn.m1racleur.miraclerpg.world.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.03 01:50
 */
public class OreFeatures {
    private static final RegistryKey<PlacedFeature> CUSTOM_BIYUKUANG_PLACED_KEY = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "biyukuang_custom"));
    private static final RegistryKey<PlacedFeature> chiHongKuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "chihongkuang"));
    private static final RegistryKey<PlacedFeature> chiTieKuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "chitiekuang"));
    private static final RegistryKey<PlacedFeature> chiXueTong = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "chixuetong"));
    private static final RegistryKey<PlacedFeature> dianlankuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "dianlankuang"));
    private static final RegistryKey<PlacedFeature> guangzikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "guangzikuang"));
    private static final RegistryKey<PlacedFeature> haijingshikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "haijingshikuang"));
    private static final RegistryKey<PlacedFeature> hongbaoshikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "hongbaoshikuang"));
    private static final RegistryKey<PlacedFeature> jinqingkuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "jinqingkuang"));
    private static final RegistryKey<PlacedFeature> keertesikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "keertesikuang"));
    private static final RegistryKey<PlacedFeature> liujinkuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "liujinkuang"));
    private static final RegistryKey<PlacedFeature> qiangweikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "qiangweikuang"));
    private static final RegistryKey<PlacedFeature> qingshifenkuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "qingshifenkuang"));
    private static final RegistryKey<PlacedFeature> shantong = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "shantong"));
    private static final RegistryKey<PlacedFeature> shuijingsuipiankuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "shuijingsuipiankuang"));
    private static final RegistryKey<PlacedFeature> wutiekuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "wutiekuang"));
    private static final RegistryKey<PlacedFeature> xuancaishikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "xuancaishikuang"));
    private static final RegistryKey<PlacedFeature> yueguangshikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "yueguangshikuang"));
    private static final RegistryKey<PlacedFeature> yunmeikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "yunmeikuang"));
    private static final RegistryKey<PlacedFeature> yunmoshuijingkuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "yunmoshuijingkuang"));
    private static final RegistryKey<PlacedFeature> zijingshikuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "zijingshikuang"));
    private static final RegistryKey<PlacedFeature> zirankuang = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier("miraclerpg", "zirankuang"));

    public void oreReg() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_BIYUKUANG_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, chiHongKuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, chiTieKuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, chiXueTong);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, dianlankuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, guangzikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, haijingshikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, hongbaoshikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, jinqingkuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, keertesikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, liujinkuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, qiangweikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, qingshifenkuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, shantong);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, shuijingsuipiankuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, wutiekuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, xuancaishikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, yueguangshikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, yunmeikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, yunmoshuijingkuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, zijingshikuang);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, zirankuang);
    }
}
