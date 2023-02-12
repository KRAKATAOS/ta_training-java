package classes.Battleship8x8;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        if (shot.equals("A1")) return shootA1(shot);
        int a1 = (shots < 0 || shots == Long.MAX_VALUE) ? -1 : 1;

        String shootB = getStringOfByte(shot);
        long cur = Long.parseLong(shootB, 2);
        if (shots == Long.MAX_VALUE) {
            shots = 0L;
        }
        shots = shots + (a1 * cur);

        return (cur & (-1 * ships)) == 0 && (cur & ships) != 0;
    }

    private boolean shootA1(String shot) {
        String shootB = getStringOfByte(shot).substring(1);

        if (shots > 0) {
            shots = -shots;
        } else {
            shots = Long.MAX_VALUE;
        }

        return ships < 0;
    }

    private String getStringOfByte(String shot) {
        byte[][] array = new byte[8][8];
        int i, j;
        j = Character.getNumericValue(shot.charAt(0)) - 10;
        i = Character.getNumericValue(shot.charAt(1)) - 1;
        array[i][j] = 1;

        StringBuilder sb = new StringBuilder();
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                sb.append(array[i][j]);
            }
        }

        return sb.toString();
    }

    public String state() {
        StringBuilder sb = new StringBuilder();
        int a1 = shots > 0 ? 1 : -1;
        long cur = 1L;
        for (int i = 0; i < 63; i++) {
            long z = (cur << i);
            if ((z & ships) == 0 && (z & shots * a1) == 0) {
                sb.append('.');
            }
            if ((z & ships) == 0 && (z & shots * a1) != 0) {
                sb.append('×');
            }
            if ((z & ships) != 0 && (z & shots * a1) == 0) {
                sb.append('☐');
            }
            if ((z & ships) != 0 && (z & shots * a1) != 0) {
                sb.append('☒');
            }
        }

        if (shots > 0 && ships > 0) {
            sb.append('.');
        }
        if (shots < 0 && ships > 0) {
            sb.append('×');
        }
        if (shots > 0 && ships < 0) {
            sb.append('☐');
        }
        if ((shots < 0 && ships < 0)) {
            sb.append('☒');
        }

        sb.reverse();
        sb.insert(8, "\n");
        sb.insert(17, "\n");
        sb.insert(26, "\n");
        sb.insert(35, "\n");
        sb.insert(44, "\n");
        sb.insert(53, "\n");
        sb.insert(62, "\n");

        return sb.toString();
    }
}
