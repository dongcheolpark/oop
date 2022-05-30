package com.Practice3;

public class BookData {

    public class DoesNotExistException extends Exception {
        public DoesNotExistException(String s) {
            super(s);
        }
    }

    private String[][] Seats;
    private String[] SeatsName = {"S","A","B"};
    private final int max_size = 10;

    public BookData() {
        Seats = new String[SeatsName.length][max_size];
    }

    public String getSeatName(int sel) throws DoesNotExistException {
        if(sel > SeatsName.length) throw new DoesNotExistException("없는 번호 입니다.");
        return SeatsName[sel-1];
    }

    private String[] selector(int sel) throws DoesNotExistException {
        if(sel > SeatsName.length) throw new DoesNotExistException("없는 번호 입니다.");
        return Seats[sel-1];
    }

    public String[] getSeat(int sel) throws DoesNotExistException {
        return selector(sel).clone();
    }

    public void setSeat(String name, int index, int sel) throws DoesNotExistException {
        String[] str = selector(sel);
        str[index-1] = name;
    }
    public void cancelSeat(String name,int sel) throws DoesNotExistException {
        String[] str = selector(sel);
        boolean chk = false;
        for(int i = 0;i<max_size;i++) {
            if(str[i] == null) continue;
            if(str[i].equals(name)) {
                str[i] = null;
                chk = true;
            }
        }
        if(!chk) {
            throw new DoesNotExistException("값이 존재하지 않습니다.");
        }
    }
}
