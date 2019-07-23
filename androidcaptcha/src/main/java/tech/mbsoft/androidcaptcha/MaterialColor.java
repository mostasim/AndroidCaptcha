package tech.mbsoft.androidcaptcha;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum MaterialColor {
    RED("Red",
            0xFF_F44336,
            0xFF_FFEBEE,
            0xFF_FFCDD2,
            0xFF_EF9A9A,
            0xFF_E57373,
            0xFF_EF5350,
            0xFF_E53935,
            0xFF_D32F2F,
            0xFF_C62828,
            0xFF_B71C1C,

            0xFF_FF8A80,
            0xFF_FF5252,
            0xFF_FF1744,
            0xFF_D50000),
    PINK("Pink",
            0xFF_E91E63,
            0xFF_FCE4EC,
            0xFF_F8BBD0,
            0xFF_F48FB1,
            0xFF_F06292,
            0xFF_EC407A,
            0xFF_D81B60,
            0xFF_C2185B,
            0xFF_AD1457,
            0xFF_880E4F,

            0xFF_FF80AB,
            0xFF_FF4081,
            0xFF_F50057,
            0xFF_C51162),
    PURPLE("Purple",
            0xFF_9C27B0,
            0xFF_F3E5F5,
            0xFF_E1BEE7,
            0xFF_CE93D8,
            0xFF_BA68C8,
            0xFF_AB47BC,
            0xFF_8E24AA,
            0xFF_7B1FA2,
            0xFF_6A1B9A,
            0xFF_4A148C,

            0xFF_EA80FC,
            0xFF_E040FB,
            0xFF_D500F9,
            0xFF_AA00FF),
    DEEP_PURPLE("Deep Purple",
            0xFF_673AB7,
            0xFF_EDE7F6,
            0xFF_D1C4E9,
            0xFF_B39DDB,
            0xFF_9575CD,
            0xFF_7E57C2,
            0xFF_5E35B1,
            0xFF_512DA8,
            0xFF_4527A0,
            0xFF_311B92,

            0xFF_B388FF,
            0xFF_7C4DFF,
            0xFF_651FFF,
            0xFF_6200EA),
    INDIGO("Indigo",
            0xFF_3F51B5,
            0xFF_E8EAF6,
            0xFF_C5CAE9,
            0xFF_9FA8DA,
            0xFF_7986CB,
            0xFF_5C6BC0,
            0xFF_3949AB,
            0xFF_303F9F,
            0xFF_283593,
            0xFF_1A237E,

            0xFF_8C9EFF,
            0xFF_536DFE,
            0xFF_3D5AFE,
            0xFF_304FFE),
    BLUE("Blue",
            0xFF_2196F3,
            0xFF_E3F2FD,
            0xFF_BBDEFB,
            0xFF_90CAF9,
            0xFF_64B5F6,
            0xFF_42A5F5,
            0xFF_1E88E5,
            0xFF_1976D2,
            0xFF_1565C0,
            0xFF_0D47A1,

            0xFF_82B1FF,
            0xFF_448AFF,
            0xFF_2979FF,
            0xFF_2962FF),
    LIGHT_BLUE("Light Blue",
            0xFF_03A9F4,
            0xFF_E1F5FE,
            0xFF_B3E5FC,
            0xFF_81D4FA,
            0xFF_4FC3F7,
            0xFF_29B6F6,
            0xFF_039BE5,
            0xFF_0288D1,
            0xFF_0277BD,
            0xFF_01579B,

            0xFF_80D8FF,
            0xFF_40C4FF,
            0xFF_00B0FF,
            0xFF_0091EA),
    CYAN("Cyan",
            0xFF_00BCD4,
            0xFF_E0F7FA,
            0xFF_B2EBF2,
            0xFF_80DEEA,
            0xFF_4DD0E1,
            0xFF_26C6DA,
            0xFF_00ACC1,
            0xFF_0097A7,
            0xFF_00838F,
            0xFF_006064,

            0xFF_84FFFF,
            0xFF_18FFFF,
            0xFF_00E5FF,
            0xFF_00B8D4),
    TEAL("Teal",
            0xFF_009688,
            0xFF_E0F2F1,
            0xFF_B2DFDB,
            0xFF_80CBC4,
            0xFF_4DB6AC,
            0xFF_26A69A,
            0xFF_00897B,
            0xFF_00796B,
            0xFF_00695C,
            0xFF_004D40,

            0xFF_A7FFEB,
            0xFF_64FFDA,
            0xFF_1DE9B6,
            0xFF_00BFA5),
    GREEN("Green",
            0xFF_4CAF50,
            0xFF_E8F5E9,
            0xFF_C8E6C9,
            0xFF_A5D6A7,
            0xFF_81C784,
            0xFF_66BB6A,
            0xFF_43A047,
            0xFF_388E3C,
            0xFF_2E7D32,
            0xFF_1B5E20,

            0xFF_B9F6CA,
            0xFF_69F0AE,
            0xFF_00E676,
            0xFF_00C853),
    LIGHT_GREEN("Light Green",
            0xFF_8BC34A,
            0xFF_F1F8E9,
            0xFF_DCEDC8,
            0xFF_C5E1A5,
            0xFF_AED581,
            0xFF_9CCC65,
            0xFF_7CB342,
            0xFF_689F38,
            0xFF_558B2F,
            0xFF_33691E,

            0xFF_CCFF90,
            0xFF_B2FF59,
            0xFF_76FF03,
            0xFF_64DD17),
    LIME("Lime",
            0xFF_CDDC39,
            0xFF_F9FBE7,
            0xFF_F0F4C3,
            0xFF_E6EE9C,
            0xFF_DCE775,
            0xFF_D4E157,
            0xFF_C0CA33,
            0xFF_AFB42B,
            0xFF_9E9D24,
            0xFF_827717,

            0xFF_F4FF81,
            0xFF_EEFF41,
            0xFF_C6FF00,
            0xFF_AEEA00),
    YELLOW("Yellow",
            0xFF_FFEB3B,
            0xFF_FFFDE7,
            0xFF_FFF9C4,
            0xFF_FFF59D,
            0xFF_FFF176,
            0xFF_FFEE58,
            0xFF_FDD835,
            0xFF_FBC02D,
            0xFF_F9A825,
            0xFF_F57F17,

            0xFF_FFFF8D,
            0xFF_FFFF00,
            0xFF_FFEA00,
            0xFF_FFD600),
    AMBER("Amber",
            0xFF_FFC107,
            0xFF_FFF8E1,
            0xFF_FFECB3,
            0xFF_FFE082,
            0xFF_FFD54F,
            0xFF_FFCA28,
            0xFF_FFB300,
            0xFF_FFA000,
            0xFF_FF8F00,
            0xFF_FF6F00,

            0xFF_FFE57F,
            0xFF_FFD740,
            0xFF_FFC400,
            0xFF_FFAB00),
    ORANGE("Orange",
            0xFF_FF9800,
            0xFF_FFF3E0,
            0xFF_FFE0B2,
            0xFF_FFCC80,
            0xFF_FFB74D,
            0xFF_FFA726,
            0xFF_FB8C00,
            0xFF_F57C00,
            0xFF_EF6C00,
            0xFF_E65100,

            0xFF_FFD180,
            0xFF_FFAB40,
            0xFF_FF9100,
            0xFF_FF6D00),
    DEEP_ORANGE("Deep Orange",
            0xFF_FF5722,
            0xFF_FBE9E7,
            0xFF_FFCCBC,
            0xFF_FFAB91,
            0xFF_FF8A65,
            0xFF_FF7043,
            0xFF_F4511E,
            0xFF_E64A19,
            0xFF_D84315,
            0xFF_BF360C,

            0xFF_FF9E80,
            0xFF_FF6E40,
            0xFF_FF3D00,
            0xFF_DD2C00),
    BROWN("Brown",
            0xFF_795548,
            0xFF_EFEBE9,
            0xFF_D7CCC8,
            0xFF_BCAAA4,
            0xFF_A1887F,
            0xFF_8D6E63,
            0xFF_6D4C41,
            0xFF_5D4037,
            0xFF_4E342E,
            0xFF_3E2723),
    GREY("Grey",
            0xFF_9E9E9E,
            0xFF_FAFAFA,
            0xFF_F5F5F5,
            0xFF_EEEEEE,
            0xFF_E0E0E0,
            0xFF_BDBDBD,
            0xFF_757575,
            0xFF_616161,
            0xFF_424242,
            0xFF_212121),
    BLUE_GREY("Blue Grey",
            0xFF_607D8B,
            0xFF_ECEFF1,
            0xFF_CFD8DC,
            0xFF_B0BEC5,
            0xFF_90A4AE,
            0xFF_78909C,
            0xFF_546E7A,
            0xFF_455A64,
            0xFF_37474F,
            0xFF_263238),
    ;

    public final String name;

    public final boolean vibrant;

    public final int c50;
    public final int c100;
    public final int c200;
    public final int c300;
    public final int c400;
    public final int c500;
    public final int c600;
    public final int c700;
    public final int c800;
    public final int c900;

    public final int a100;
    public final int a200;
    public final int a400;
    public final int a700;

    MaterialColor(String name, int c500, int c50, int c100, int c200,
                  int c300, int c400, int c600, int c700, int c800, int c900) {
        this.name = name;

        this.c50  = c50;
        this.c100 = c100;
        this.c200 = c200;
        this.c300 = c300;
        this.c400 = c400;
        this.c500 = c500;
        this.c600 = c600;
        this.c700 = c700;
        this.c800 = c800;
        this.c900 = c900;

        this.a100 = c100;
        this.a200 = c200;
        this.a400 = c400;
        this.a700 = c700;

        this.vibrant = false;
    }
    MaterialColor(String name, int c500, int c50, int c100, int c200,
                  int c300, int c400, int c600, int c700, int c800, int c900,
                  int a100, int a200, int a400, int a700) {
        this.name = name;

        this.c50  = c50;
        this.c100 = c100;
        this.c200 = c200;
        this.c300 = c300;
        this.c400 = c400;
        this.c500 = c500;
        this.c600 = c600;
        this.c700 = c700;
        this.c800 = c800;
        this.c900 = c900;

        this.a100 = a100;
        this.a200 = a200;
        this.a400 = a400;
        this.a700 = a700;

        this.vibrant = true;
    }

    /**
     * @param index 50, 100, 200, ...
     * @return a primary color (e.g. 500)
     */
    public int getPrimaryColor(int index) {
        switch (index) {
            case 50 : return c50;
            case 100: return c100;
            case 200: return c200;
            case 300: return c300;
            case 400: return c400;
            case 500: return c500;
            case 600: return c600;
            case 700: return c700;
            case 800: return c800;
            case 900: return c900;
        }
        throw new IllegalArgumentException("Invalid color index "+index);
    }

    /**
     * @param index 100, 200, 400, or 700
     * @return an accent color (e.g. A200)
     */
    public int getAccentColor(int index) {
        if (!vibrant) throw new IllegalArgumentException(this.name+" is not vibrant");
        switch (index) {
            case 100: return a100;
            case 200: return a200;
            case 400: return a400;
            case 700: return a700;
        }
        throw new IllegalArgumentException("Invalid accent color index "+index);
    }



    private static final MaterialColor[] VALUES_ARR = values();
    private static final MaterialColor[] VIBRANT_VALUES;
    private static final MaterialColor[] DULL_VALUES;

    public static final List<MaterialColor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARR));

    static {
        int vibrantCount = 0;
        for (MaterialColor mc : VALUES_ARR) {
            if (mc.vibrant) vibrantCount++;
        }
        VIBRANT_VALUES = new MaterialColor[vibrantCount];
        DULL_VALUES = new MaterialColor[VALUES_ARR.length-vibrantCount];
        int idxVibrant = 0;
        int idxDull = 0;
        for ( MaterialColor mc : VALUES) {
            if (mc.vibrant) {
                VIBRANT_VALUES[idxVibrant] = mc;
                idxVibrant++;
            } else {
                DULL_VALUES[idxDull] = mc;
                idxDull++;
            }
        }
    }

    private static final Random rand = new Random(System.nanoTime()^System.currentTimeMillis());

    public static MaterialColor random() {
        return VALUES_ARR[rand.nextInt(VALUES_ARR.length)];
    }

    public static MaterialColor randomVibrant() {
        return VIBRANT_VALUES[rand.nextInt(VIBRANT_VALUES.length)];
    }

    public static MaterialColor randomDull() {
        return DULL_VALUES[rand.nextInt(DULL_VALUES.length)];
    }


    public static MaterialColor hash(Object o) {
        if (o == null) return GREY;
        return VALUES_ARR[Math.abs(o.hashCode()) % VALUES_ARR.length];
    }

    public static MaterialColor hashVibrant(Object o) {
        if (o == null) return RED;
        return VIBRANT_VALUES[Math.abs(o.hashCode()) % VIBRANT_VALUES.length];
    }

    public static MaterialColor hashDull(Object o) {
        if (o == null) return GREY;
        return DULL_VALUES[Math.abs(o.hashCode()) % DULL_VALUES.length];
    }

}