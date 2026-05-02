import java.util.ArrayList;
import java.util.List;

/**
 * 25 classic star / number printing patterns (loops start from 1).
 * Run: java PrintPatterns [n]   default n=5
 */
public class PrintPatterns {

    private static String repeat(String s, int count) {
        StringBuilder b = new StringBuilder(s.length() * count);
        for (int i = 0; i < count; i++) {
            b.append(s);
        }
        return b.toString();
    }

    private static String center(String s, int width) {
        if (s.length() >= width) {
            return s;
        }
        int pad = width - s.length();
        int left = pad / 2;
        return repeat(" ", left) + s + repeat(" ", pad - left);
    }

    public static String squareHollow(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                sb.append(repeat("*", n));
            } else {
                sb.append("*").append(repeat(" ", n - 2)).append("*");
            }
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String numberTriangle(int n) {
        int lastW = String.join(" ", java.util.Collections.nCopies(n, String.valueOf(n))).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            String num = String.valueOf(i);
            for (int k = 1; k <= i; k++) {
                if (k > 1) {
                    row.append(" ");
                }
                row.append(num);
            }
            String body = row.toString();
            int pad = (lastW - body.length()) / 2;
            sb.append(repeat(" ", pad)).append(body);
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String numberIncreasingPyramid(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    sb.append(" ");
                }
                sb.append(j);
            }
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String numberIncreasingReversePyramid(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int k = n - i + 1;
            for (int j = 1; j <= k; j++) {
                if (j > 1) {
                    sb.append(" ");
                }
                sb.append(j);
            }
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String numberChangingPyramid(int n) {
        int cur = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    sb.append(" ");
                }
                sb.append(cur++);
            }
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String zeroOneTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int start = (i % 2 == 1) ? 1 : 0;
            for (int j = 0; j < i; j++) {
                if (j > 0) {
                    sb.append(" ");
                }
                sb.append((start + j) % 2);
            }
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String palindromeTriangle(int n) {
        List<Integer> maxSeq = new ArrayList<>();
        for (int x = n; x >= 1; x--) {
            maxSeq.add(x);
        }
        for (int x = 2; x <= n; x++) {
            maxSeq.add(x);
        }
        StringBuilder maxLine = new StringBuilder();
        for (int x = 0; x < maxSeq.size(); x++) {
            if (x > 0) {
                maxLine.append(" ");
            }
            maxLine.append(maxSeq.get(x));
        }
        int mw = maxLine.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            List<Integer> seq = new ArrayList<>();
            for (int x = i; x >= 1; x--) {
                seq.add(x);
            }
            for (int x = 2; x <= i; x++) {
                seq.add(x);
            }
            StringBuilder row = new StringBuilder();
            for (int x = 0; x < seq.size(); x++) {
                if (x > 0) {
                    row.append(" ");
                }
                row.append(seq.get(x));
            }
            String body = row.toString();
            int pad = (mw - body.length()) / 2;
            sb.append(repeat(" ", pad)).append(body);
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String rhombusPattern(int n) {
        return diamondPattern(n);
    }

    public static String diamondPattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat(" ", n - i)).append(repeat("*", 2 * i - 1)).append("\n");
        }
        for (int i = n - 1; i >= 1; i--) {
            sb.append(repeat(" ", n - i)).append(repeat("*", 2 * i - 1));
            if (i > 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String butterflyPattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat("*", i)).append(repeat(" ", 2 * (n - i))).append(repeat("*", i)).append("\n");
        }
        for (int i = n; i >= 1; i--) {
            sb.append(repeat("*", i)).append(repeat(" ", 2 * (n - i))).append(repeat("*", i));
            if (i > 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String squareFill(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat("*", n));
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String rightHalfPyramid(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat("*", i));
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String reverseRightHalfPyramid(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat("*", n - i + 1));
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String leftHalfPyramid(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat(" ", n - i)).append(repeat("*", i));
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String reverseLeftHalfPyramid(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int k = n - i + 1;
            sb.append(repeat(" ", n - k)).append(repeat("*", k));
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String kPattern(int n) {
        int w = 2 * n - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 2 * n; i++) {
            char[] row = new char[w];
            for (int c = 0; c < w; c++) {
                row[c] = ' ';
            }
            row[0] = '*';
            int right = (i <= n) ? (w - i) : (i - 1);
            if (right >= 0 && right < w) {
                row[right] = '*';
            }
            int lastNonSpace = 0;
            for (int c = w - 1; c >= 0; c--) {
                if (row[c] != ' ') {
                    lastNonSpace = c;
                    break;
                }
            }
            sb.append(new String(row, 0, lastNonSpace + 1));
            if (i < 2 * n - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String triangleStarPattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat(" ", n - i)).append(repeat("*", 2 * i - 1));
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String reverseNumberTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat(" ", i - 1));
            for (int j = i; j <= n; j++) {
                if (j > i) {
                    sb.append(" ");
                }
                sb.append(j);
            }
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String mirrorImageTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            sb.append(repeat(" ", n - i)).append(repeat("*", 2 * i - 1)).append("\n");
        }
        for (int i = 2; i <= n; i++) {
            sb.append(repeat(" ", n - i)).append(repeat("*", 2 * i - 1));
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String hollowTriangle(int n) {
        int w = 2 * n - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                sb.append(center("*", w));
            } else if (i == n) {
                StringBuilder base = new StringBuilder();
                for (int k = 1; k <= n; k++) {
                    if (k > 1) {
                        base.append(" ");
                    }
                    base.append("*");
                }
                sb.append(base);
            } else {
                int inner = 2 * i - 3;
                sb.append(center("*" + repeat(" ", inner) + "*", w));
            }
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String hollowReverseTriangle(int n) {
        int w = 2 * n - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            if (i == n) {
                StringBuilder base = new StringBuilder();
                for (int k = 1; k <= n; k++) {
                    if (k > 1) {
                        base.append(" ");
                    }
                    base.append("*");
                }
                sb.append(base);
            } else if (i == 1) {
                sb.append(center("*", w));
            } else {
                int inner = 2 * i - 3;
                sb.append(center("*" + repeat(" ", inner) + "*", w));
            }
            if (i > 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String hollowDiamondPyramid(int n) {
        int w = 2 * n - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                sb.append(center("*", w));
            } else {
                int inner = 2 * i - 3;
                sb.append(center("*" + repeat(" ", inner) + "*", w));
            }
            sb.append("\n");
        }
        for (int i = n - 1; i >= 1; i--) {
            if (i == 1) {
                sb.append(center("*", w));
            } else {
                int inner = 2 * i - 3;
                sb.append(center("*" + repeat(" ", inner) + "*", w));
            }
            if (i > 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String hollowHourglass(int n) {
        int w = 2 * n - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            appendHollowHourglassRow(sb, i, n, w);
            sb.append("\n");
        }
        for (int i = 2; i <= n; i++) {
            appendHollowHourglassRow(sb, i, n, w);
            if (i < n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static void appendHollowHourglassRow(StringBuilder sb, int i, int n, int w) {
        if (i == n) {
            StringBuilder base = new StringBuilder();
            for (int k = 1; k <= n; k++) {
                if (k > 1) {
                    base.append(" ");
                }
                base.append("*");
            }
            sb.append(base);
        } else if (i == 1) {
            sb.append(center("*", w));
        } else {
            int inner = 2 * i - 3;
            sb.append(center("*" + repeat(" ", inner) + "*", w));
        }
    }

    public static String pascalTriangle(int n) {
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i > 1) {
                List<Integer> prev = rows.get(rows.size() - 1);
                for (int j = 1; j < prev.size(); j++) {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
                row.add(1);
            }
            rows.add(row);
        }
        List<Integer> last = rows.get(rows.size() - 1);
        StringBuilder lastLine = new StringBuilder();
        for (int x = 0; x < last.size(); x++) {
            if (x > 0) {
                lastLine.append(" ");
            }
            lastLine.append(last.get(x));
        }
        int width = lastLine.length();

        StringBuilder sb = new StringBuilder();
        for (List<Integer> row : rows) {
            StringBuilder line = new StringBuilder();
            for (int x = 0; x < row.size(); x++) {
                if (x > 0) {
                    line.append(" ");
                }
                line.append(row.get(x));
            }
            String body = line.toString();
            int pad = (width - body.length()) / 2;
            sb.append(repeat(" ", pad)).append(body).append("\n");
        }
        return sb.toString().replaceAll("\n$", "");
    }

    public static String rightPascalTriangle(int n) {
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i > 1) {
                List<Integer> prev = rows.get(rows.size() - 1);
                for (int j = 1; j < prev.size(); j++) {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
                row.add(1);
            }
            rows.add(row);
        }
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < rows.size(); r++) {
            List<Integer> row = rows.get(r);
            for (int x = 0; x < row.size(); x++) {
                if (x > 0) {
                    sb.append(" ");
                }
                sb.append(row.get(x));
            }
            if (r < rows.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static final class NamedPattern {
        final String name;
        final java.util.function.Function<Integer, String> fn;

        NamedPattern(String name, java.util.function.Function<Integer, String> fn) {
            this.name = name;
            this.fn = fn;
        }
    }

    private static java.util.List<NamedPattern> buildPatterns() {
        java.util.List<NamedPattern> list = new java.util.ArrayList<>();
        list.add(new NamedPattern("01 Square Hollow Pattern", PrintPatterns::squareHollow));
        list.add(new NamedPattern("02 Number Triangle", PrintPatterns::numberTriangle));
        list.add(new NamedPattern("03 Number Increasing Pyramid", PrintPatterns::numberIncreasingPyramid));
        list.add(new NamedPattern("04 Number Increasing Reverse Pyramid", PrintPatterns::numberIncreasingReversePyramid));
        list.add(new NamedPattern("05 Number Changing Pyramid", PrintPatterns::numberChangingPyramid));
        list.add(new NamedPattern("06 Zero-One Triangle", PrintPatterns::zeroOneTriangle));
        list.add(new NamedPattern("07 Palindrome Triangle", PrintPatterns::palindromeTriangle));
        list.add(new NamedPattern("08 Rhombus Pattern", PrintPatterns::rhombusPattern));
        list.add(new NamedPattern("09 Diamond Pattern", PrintPatterns::diamondPattern));
        list.add(new NamedPattern("10 Butterfly Star Pattern", PrintPatterns::butterflyPattern));
        list.add(new NamedPattern("11 Square Fill Pattern", PrintPatterns::squareFill));
        list.add(new NamedPattern("12 Right Half Pyramid", PrintPatterns::rightHalfPyramid));
        list.add(new NamedPattern("13 Reverse Right Half Pyramid", PrintPatterns::reverseRightHalfPyramid));
        list.add(new NamedPattern("14 Left Half Pyramid", PrintPatterns::leftHalfPyramid));
        list.add(new NamedPattern("15 Reverse Left Half Pyramid", PrintPatterns::reverseLeftHalfPyramid));
        list.add(new NamedPattern("16 K Pattern", PrintPatterns::kPattern));
        list.add(new NamedPattern("17 Triangle Star Pattern", PrintPatterns::triangleStarPattern));
        list.add(new NamedPattern("18 Reverse Number Triangle Pattern", PrintPatterns::reverseNumberTriangle));
        list.add(new NamedPattern("19 Mirror Image Triangle Pattern", PrintPatterns::mirrorImageTriangle));
        list.add(new NamedPattern("20 Hollow Triangle Pattern", PrintPatterns::hollowTriangle));
        list.add(new NamedPattern("21 Hollow Reverse Triangle Pattern", PrintPatterns::hollowReverseTriangle));
        list.add(new NamedPattern("22 Hollow Diamond Pyramid", PrintPatterns::hollowDiamondPyramid));
        list.add(new NamedPattern("23 Hollow Hourglass Pattern", PrintPatterns::hollowHourglass));
        list.add(new NamedPattern("24 Pascal's Triangle", PrintPatterns::pascalTriangle));
        list.add(new NamedPattern("25 Right Pascal's Triangle", PrintPatterns::rightPascalTriangle));
        return list;
    }

    private static final java.util.List<NamedPattern> PATTERNS = buildPatterns();

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        String bar = repeat("=", 60);
        for (NamedPattern p : PATTERNS) {
            System.out.println("\n" + bar);
            System.out.println(p.name);
            System.out.println(bar);
            System.out.println(p.fn.apply(n));
        }
    }
}
