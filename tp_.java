/*
 * Decompiled with CFR 0.151.
 */
import java.io.IOException;

final class tp_
extends bb_ {
	//original name: _z
    static String orb_majesty = "Orb of Majesty";
    static ef_ _B;
    //original name: _A
    static String[] tutorial_selectraiders;
    private rk_ _D;
    //original name: _u
    static String text_dungeon_assault;
    //original name: _C
    static String[] tutorial_strategies1;
    //original name: _w
    static String text_sort_rooms_by;
    static ad_ _y;
    static String _v;
    //original name: _x
    static String create_alert_passcontainsemail;

    public static void h150(int n) {
        tutorial_strategies1 = null;
        _y = null;
        text_dungeon_assault = null;
        orb_majesty = null;
        _B = null;
        create_alert_passcontainsemail = null;
        text_sort_rooms_by = null;
        tutorial_selectraiders = null;
        if (n < 0) {
            _B = null;
        }
        _v = null;
    }

    @Override
    final void f150(int n) {
        try {
            this._D.c150(-6624);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this._c = -1;
        this._D = null;
        ++this._h;
        this._j = (byte)(1.0 + 255.0 * Math.random());
    }

    @Override
    final void a150(int n) {
        if (null != this._D) {
            this._D.c150(-6624);
        }
        if (n != -1016) {
            text_dungeon_assault = null;
        }
    }

    @Override
    //connect to server?
    final boolean b427(byte by) {
        int n;
        if (null != this._D) {
            long l = kd_.getTime();
            n = (int)(-this.oldTime + l);
            this.oldTime = l;
            if (n > 200) {
                n = 200;
            }
            this._a += n;
            if (this._a > 30000) {
                try {
                    this._D.c150(-6624);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this._D = null;
            }
        }
        if (null == this._D) {
            return this.c137(20) == 0 && 0 == this.e137(20); //pretty sure this returns 0
        }
        try {
            if (by <= 6) { //garbage condition
                return true;
            }
            this._D.b150(-89); //doesnt really do anything
            em_ em_2 = (em_)this._g.c729();
            while (em_2 != null) {
                this.dataBuffer2.currentIndex = 0;
                this.dataBuffer2.storeByte(1);
                this.dataBuffer2.storeLong5Byte(em_2._o);
                this._D.b120(this.dataBuffer2.buffer, this.dataBuffer2.buffer.length); //writes byte
                this._p.a857(em_2);
                em_2 = (em_)this._g.a786((byte)111);
            }
            em_2 = (em_)this._d.c729();
            while (em_2 != null) {
                this.dataBuffer2.currentIndex = 0;
                this.dataBuffer2.storeByte(0);
                this.dataBuffer2.storeLong5Byte(em_2._o);
                this._D.b120(this.dataBuffer2.buffer, this.dataBuffer2.buffer.length);
                this._s.a857(em_2);
                em_2 = (em_)this._d.a786((byte)102);
            }
            for (int i = 0; 100 > i; ++i) {
                int n2;
                //original name: n3
                int totalDataReceived;
                int numberOfBytesToRead;
                //original name n5
                int bytesAvailable = this._D.getNumberOfAvailableBytes(); //number of bytes available
                if (0 > bytesAvailable) {
                    throw new IOException();
                }
                if (bytesAvailable == 0) break; //if we're done reading data, leave
                this._a = 0; //something time related
                n = 0;
                if (null == this._i) { //read header
                    n = 10;
                } else if (this._i._G == 0) {
                    n = 1;
                }
                if (n <= 0) { 
                    numberOfBytesToRead = 512 - this._i._G;
                    totalDataReceived = this._i.dataBuffer.buffer.length - this._i._E;
                    if (numberOfBytesToRead > totalDataReceived - this._i.dataBuffer.currentIndex) {
                        numberOfBytesToRead = -this._i.dataBuffer.currentIndex + totalDataReceived; //this gets hit
                    }
                    if (bytesAvailable < numberOfBytesToRead) {
                        numberOfBytesToRead = bytesAvailable;
                    }
                    this._D.readDataIntoArray(this._i.dataBuffer.buffer, false, numberOfBytesToRead, this._i.dataBuffer.currentIndex);
                    if (this._j != 0) {
                        for (n2 = 0; numberOfBytesToRead > n2; ++n2) {
                            this._i.dataBuffer.buffer[this._i.dataBuffer.currentIndex + n2] = (byte)md_.xor(this._i.dataBuffer.buffer[this._i.dataBuffer.currentIndex + n2], this._j);
                        }
                    }
                    this._i._G += numberOfBytesToRead;
                    this._i.dataBuffer.currentIndex += numberOfBytesToRead;
                    if (this._i.dataBuffer.currentIndex == totalDataReceived) { //end of stream
                        this._i.b423();
                        //need to get here
                        this._i._v = false;
                        this._i = null;
                        continue;
                    }
                    if (this._i._G != 512) continue;
                    this._i._G = 0;
                    continue;
                }
                totalDataReceived = n - this.dataBuffer1.currentIndex;
                if (bytesAvailable < totalDataReceived) {
                    totalDataReceived = bytesAvailable;
                }
                this._D.readDataIntoArray(this.dataBuffer1.buffer, false, totalDataReceived, this.dataBuffer1.currentIndex);
                if (0 != this._j) { //xor byte
                    for (numberOfBytesToRead = 0; numberOfBytesToRead < totalDataReceived; ++numberOfBytesToRead) {
                        this.dataBuffer1.buffer[numberOfBytesToRead + this.dataBuffer1.currentIndex] = (byte)md_.xor(this.dataBuffer1.buffer[numberOfBytesToRead + this.dataBuffer1.currentIndex], this._j);
                    }
                }
                this.dataBuffer1.currentIndex += totalDataReceived;
                if (n > this.dataBuffer1.currentIndex) continue;
                if (this._i == null) {
                    this.dataBuffer1.currentIndex = 0;
                    numberOfBytesToRead = this.dataBuffer1.readByte(); //wrong name
                    n2 = this.dataBuffer1.readInt();
                    int n6 = this.dataBuffer1.readByte();
                    int n7 = this.dataBuffer1.readInt();
                    int n8 = n6 & 0x7F;
                    boolean bl = 0 != (0x80 & n6); //< 127 or > 127
                    long l = (long)n2 + ((long)numberOfBytesToRead << 32);
                    em_ em_3 = null;
                    if (bl) {
                        em_3 = (em_)this._s.c729();
                        while (null != em_3 && l != em_3._o) {
                            em_3 = (em_)this._s.a786((byte)66);
                        }
                    } else {
                        em_3 = (em_)this._p.c729();
                        while (em_3 != null && em_3._o != l) {
                            em_3 = (em_)this._p.a786((byte)117);
                        }
                    }
                    if (em_3 == null) {
                        throw new IOException();
                    }
                    int n9 = n8 == 0 ? 5 : 9;
                    this._i = em_3;
                    this._i.dataBuffer = new ec_(this._i._E + n9 + n7);
                    this._i.dataBuffer.storeByte(n8);
                    this._i.dataBuffer.storeInt(n7);
                    this._i._G = 10;
                    this.dataBuffer1.currentIndex = 0;
                    continue;
                }
                if (this._i._G == 0) {
                    if (-1 != this.dataBuffer1.buffer[0]) {
                        this._i = null;
                        continue;
                    }
                    this.dataBuffer1.currentIndex = 0;
                    this._i._G = 1;
                    continue;
                }
                throw new IOException();
            }
            return true;
        }
        catch (IOException iOException) {
            try {
                this._D.c150(-6624);
            }
            catch (Exception exception) {
                // empty catch block
            }
            this._c = -2;
            ++this._h;
            this._D = null;
            return this.c137(20) == 0 && 0 == this.e137(20);
        }
    }

    //original signature: private final void g150(int n) {
    private final void writeOpCode6() {
        if (null == this._D) {
            return;
        }
        try {
            this.dataBuffer2.currentIndex = 0;
            this.dataBuffer2.storeByte(6);
            this.dataBuffer2.storeTribyte(3);
            this.dataBuffer2.storeShort(0);
            this._D.b120(this.dataBuffer2.buffer, this.dataBuffer2.buffer.length); //writes packet
        }
        catch (IOException iOException) {
            try {
                this._D.c150(-6624);
            }
            catch (Exception exception) {
                // empty catch block
            }
            this._c = -2;
            this._D = null;
            ++this._h;
        }
    }

    //original signature: static final void a132(int n, float f, String string) {
    static final void a132(float percentage, String string) {
        lj_._e = string;
        lc_.percentLoaded = percentage;
    }

    @Override
    //original signature: final void a993(Object object, boolean bl, byte by) {
    final void a993(Object object, boolean bl) {
        em_ em_2;
        if (null != this._D) {
            try {
                this._D.c150(-6624);
            }
            catch (Exception exception) {
                // empty catch block
            }
            this._D = null;
        }
        this._D = (rk_)object;
        this.writeOpCode6();
        this.writeOpCode3(bl);
        this._i = null;
        this.dataBuffer1.currentIndex = 0;
        while (null != (em_2 = (em_)this._p.a729(-8))) {
            this._g.a857(em_2);
        }
        while (null != (em_2 = (em_)this._s.a729(121))) {
            this._d.a857(em_2);
        }
        if (this._j != 0) {
            try {
                this.dataBuffer2.currentIndex = 0;
                this.dataBuffer2.storeByte(4);
                this.dataBuffer2.storeByte(this._j);
                this.dataBuffer2.storeInt(0);
                this._D.b120(this.dataBuffer2.buffer, this.dataBuffer2.buffer.length); //write code 4
            }
            catch (IOException iOException) {
                try {
                    this._D.c150(-6624);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this._D = null;
                this._c = -2;
                ++this._h;
            }
        }
        this._a = 0;
        this.oldTime = kd_.getTime();
    }

    //original signature: private final void a540(boolean bl, int n) {
    private final void writeOpCode3(boolean bl) {
        if (this._D == null) {
            return;
        }
        try {
            this.dataBuffer2.currentIndex = 0;
            this.dataBuffer2.storeByte(!bl ? 3 : 2); //probably always 3
            this.dataBuffer2.storeLong5Byte(0L);
            this._D.b120(this.dataBuffer2.buffer, this.dataBuffer2.buffer.length);
        }
        catch (IOException iOException) {
            try {
                this._D.c150(-6084);
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++this._h;
            this._D = null;
            this._c = -2;
        }
    }

    //original signature: static final Animation a267(nh_ nh_2, String string, String string2, int n) {
    static final Animation unpackAnimation(nh_ nh_2, String animationName, String unitName) {
        Animation animation = new Animation();
        animation.animationName = animationName;
        animation.unitName = unitName;
        animation._d = nh_2;
        byte[] byArray = nh_2.a826("config", unitName + "/" + animationName);
        ec_ ec_2 = new ec_(byArray);
        animation._c = (byArray.length - 4) / 2;
        animation._j = new int[animation._c];
        animation._l = null;
        animation._f = 0;
        animation._k = new int[animation._c];
        animation._g = ec_2.readShort();
        animation._m = ec_2.readShort();
        for (int i = 0; animation._c > i; ++i) {
            int n2 = ec_2.readByte();
            int n3 = 10 * ec_2.readByte();
            animation._k[i] = n2;
            animation._j[i] = n3;
            animation._f += n3;
        }
        return animation;
    }

    static {
        tutorial_selectraiders = new String[]{null, "After selecting your target, you now need to choose which <%raiders> will form the party to send out. Select up to four <%raiders> by <col=FF0000>left-clicking on them</col>, then <col=FF0000>click 'Raid' to continue</col>. Remember to take a selection of <%raiders> with skills to overcome any form of defence you might encounter."};
        text_dungeon_assault = "DUNGEON ASSAULT";
        tutorial_strategies1 = new String[]{"Surprise", "There are other aspects to combat between raiders and monsters; first is the element of <%highlight>surprise</col>. If your raider succeeds in surprising the monster, it will be able to <%highlight>strike first</col> - coupled with a high <%attack> skill, your raider may be able to defeat the monster before it gets a chance to strike back."};
        _B = new ef_();
        text_sort_rooms_by = "Sort rooms by <%0>";
        _y = new ad_(2, 0);
        create_alert_passcontainsemail = "This password contains your email address, and would be easy to guess";
    }
}

