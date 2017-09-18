/*
 * The MIT License
 *
 * Copyright 2016 samasend.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.andegnasoft.convertor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samasend
 */
public class ወደግዕዝመቀየርያ_መገምገሚያ {

    protected String[][] ፈተናዎች = {
        {"1", "፩"},
        {"10", "፲"},
        {"100", "፻"},
        {"1000", "፲፻"},
        {"10000", "፼"}, // (እልፍ)
        {"100000", "፲፼"}, // (አእላፍ)
        {"1000000", "፻፼"}, // (አእላፋት)
        {"10000000", "፲፻፼"}, // (ትእልፊት)
        {"100000000", "፼፼"}, // (ትእልፊታት)
        {"1000000000", "፲፼፼"},
        {"10000000000", "፻፼፼"},
        {"100000000000", "፲፻፼፼"}, // (ምእልፊት)
        {"1000000000000", "፼፼፼"}, // (ምእልፊታት)
        {"100010000", "፼፩፼"},
        {"100100000", "፼፲፼"},
        {"100200000", "፼፳፼"},
        {"100110000", "፼፲፩፼"},
        {"1", "፩"},
        {"11", "፲፩"},
        {"111", "፻፲፩"},
        {"1111", "፲፩፻፲፩"},
        {"11111", "፼፲፩፻፲፩"},
        {"111111", "፲፩፼፲፩፻፲፩"},
        {"1111111", "፻፲፩፼፲፩፻፲፩"},
        {"11111111", "፲፩፻፲፩፼፲፩፻፲፩"},
        {"111111111", "፼፲፩፻፲፩፼፲፩፻፲፩"},
        {"1111111111", "፲፩፼፲፩፻፲፩፼፲፩፻፲፩"},
        {"11111111111", "፻፲፩፼፲፩፻፲፩፼፲፩፻፲፩"},
        {"111111111111", "፲፩፻፲፩፼፲፩፻፲፩፼፲፩፻፲፩"},
        {"1111111111111", "፼፲፩፻፲፩፼፲፩፻፲፩፼፲፩፻፲፩"},
        {"1", "፩"},
        {"12", "፲፪"},
        {"123", "፻፳፫"},
        {"1234", "፲፪፻፴፬"},
        {"12345", "፼፳፫፻፵፭"},
        {"7654321", "፯፻፷፭፼፵፫፻፳፩"},
        {"17654321", "፲፯፻፷፭፼፵፫፻፳፩"},
        {"51615131", "፶፩፻፷፩፼፶፩፻፴፩"},
        {"15161513", "፲፭፻፲፮፼፲፭፻፲፫"},
        {"10101011", "፲፻፲፼፲፻፲፩"},
        {"101", "፻፩"},
        {"1001", "፲፻፩"},
        {"1010", "፲፻፲"},
        {"1011", "፲፻፲፩"},
        {"1100", "፲፩፻"},
        {"1101", "፲፩፻፩"},
        {"1111", "፲፩፻፲፩"},
        {"10001", "፼፩"},
        {"10010", "፼፲"},
        {"10100", "፼፻"},
        {"10101", "፼፻፩"},
        {"10110", "፼፻፲"},
        {"10111", "፼፻፲፩"},
        {"100001", "፲፼፩"},
        {"100010", "፲፼፲"},
        {"100011", "፲፼፲፩"},
        {"100100", "፲፼፻"},
        {"101010", "፲፼፲፻፲"},
        {"1000001", "፻፼፩"},
        {"1000101", "፻፼፻፩"},
        {"1000100", "፻፼፻"},
        {"1010000", "፻፩፼"},
        {"1010001", "፻፩፼፩"},
        {"1100001", "፻፲፼፩"},
        {"1010101", "፻፩፼፻፩"},
        {"101010101", "፼፻፩፼፻፩"},
        {"100010000", "፼፩፼"},
        {"100010100", "፼፩፼፻"},
        {"101010100", "፼፻፩፼፻"},
        {"3", "፫"},
        {"30", "፴"},
        {"33", "፴፫"},
        {"303", "፫፻፫"},
        {"3003", "፴፻፫"},
        {"3030", "፴፻፴"},
        {"3033", "፴፻፴፫"},
        {"3300", "፴፫፻"},
        {"3303", "፴፫፻፫"},
        {"3333", "፴፫፻፴፫"},
        {"30003", "፫፼፫"},
        {"30303", "፫፼፫፻፫"},
        {"300003", "፴፼፫"},
        {"303030", "፴፼፴፻፴"},
        {"3000003", "፫፻፼፫"},
        {"3000303", "፫፻፼፫፻፫"},
        {"3030003", "፫፻፫፼፫"},
        {"3300003", "፫፻፴፼፫"},
        {"3030303", "፫፻፫፼፫፻፫"},
        {"303030303", "፫፼፫፻፫፼፫፻፫"},
        {"333333333", "፫፼፴፫፻፴፫፼፴፫፻፴፫"}
    };

    @Test
    public void testConvert() {

        ወደግዕዝመቀየርያ convertor = new ወደግዕዝመቀየርያ();

        for (String[] ፈተና : ፈተናዎች) {
            long l = Long.parseLong(ፈተና[0]);

            String ውጤት = convertor.ቀይር(l);

            assertEquals(ፈተና[1], ውጤት);
        }

    }

}
