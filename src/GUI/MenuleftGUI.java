package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class MenuleftGUI extends JFrame {

    private JPanel contentPane;
    private CardLayout cardlayout;
    private JPanel menuleft;
    private JLabel lblhome;
    private JLabel lblbook;
    private JLabel lblauthor;
    private JLabel lblcategory;
    private JLabel lbllogout;
    private JLabel lblpublish;
    private JLabel lblstatis;
    private JLabel lblstaff;
    private JLabel lblreader;
    private JLabel lblborrow;
    private JLabel lblimport;
    private JLabel lblBorrowBook;
    private JPanel panelBook;
    private JPanel panelHome;
    private JPanel panelAuthor;
    private JPanel panelstaff;
    private JPanel panelreader;
    private JPanel panelPublish;
    private JLabel jLabelright;
    private final JPanel panelStatis;
    private final JPanel panelBorrow;
    private final JPanel panelCoupon;
    public boolean isMouseOver = false;
    private JPanel panelBorrowBooks;
    private JPanel panelAccount;
    private JLabel lblAccount;

    public MenuleftGUI() {

        setUndecorated(true);
        setBounds(50, 50, 1200, 650);
        contentPane = new JPanel();
        cardlayout = new CardLayout();
        contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);
        contentPane.setBackground(new Color(0, 0, 209));
        setLocationRelativeTo(null);

        // JPanel Home
        panelHome = new JPanel();
        HomeGUI home = new HomeGUI();
        panelHome.setLayout(new BorderLayout());
        panelHome.add(home, BorderLayout.CENTER);
        // JPanel Book
        panelBook = new JPanel();
        BookGUI book = new BookGUI();
        panelBook.setLayout(new BorderLayout());
        panelBook.add(book, BorderLayout.CENTER);
        // Jpanel Author
        panelAuthor = new JPanel();
        AuthorGUI author = new AuthorGUI();
        panelAuthor.setLayout(new BorderLayout());
        panelAuthor.add(author, BorderLayout.CENTER);
        // staff
        panelstaff = new JPanel();
        StaffGUI staff = new StaffGUI();
        panelstaff.setLayout(new BorderLayout());
        panelstaff.add(staff, BorderLayout.CENTER);
        // reader
        panelreader = new JPanel();
        ReaderGUI reader = new ReaderGUI();
        panelreader.setLayout(new BorderLayout());
        panelreader.add(reader, BorderLayout.CENTER);
        // Jpanel Publish
        panelPublish = new JPanel();
        PublishGUI publish = new PublishGUI();
        panelPublish.setLayout(new BorderLayout());
        panelPublish.add(publish, BorderLayout.CENTER);
        // Jpanel Statistical
        panelStatis = new JPanel();
//        Statistical_2GUI statis = new Statistical_2GUI();
        Statistical_GUI statis = new Statistical_GUI();
        panelStatis.setLayout(new BorderLayout());
        panelStatis.add(statis, BorderLayout.CENTER);
        // Jpanel Borrow
        panelBorrow = new JPanel();
        BorrowGUI borrow = new BorrowGUI();
        panelBorrow.setLayout(new BorderLayout());
        panelBorrow.add(borrow, BorderLayout.CENTER);
        // Jpanel Coupon
        panelCoupon = new JPanel();
        CouponGUI coupon = new CouponGUI();
        panelCoupon.setLayout(new BorderLayout());
        panelCoupon.add(coupon, BorderLayout.CENTER);

        //Jpanel BorrowBooks
        panelBorrowBooks = new JPanel();
        BorrowBooks borrowBook = new BorrowBooks();
        panelBorrowBooks.setLayout(new BorderLayout());
        panelBorrowBooks.add(borrowBook, BorderLayout.CENTER);

        // card layout
        JPanel cardPanel = new JPanel(cardlayout);
        cardPanel.add(panelHome, "home");
        cardPanel.add(panelBook, "book");
        cardPanel.add(panelAuthor, "author");
        cardPanel.add(panelstaff, "staff");
        cardPanel.add(panelreader, "reader");
        cardPanel.add(panelPublish, "publish");
        cardPanel.add(panelStatis, "statis");
        cardPanel.add(panelBorrow, "borrow");
        cardPanel.add(panelCoupon, "coupon");
        cardPanel.add(panelBorrowBooks, "borrowBook");
        contentPane.add(cardPanel, BorderLayout.CENTER);

        // Home
        lblhome.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "home");
                lblhome.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblhome.setBackground(new Color(0, 206, 209));
            }
        });
        // Book
        lblbook.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "book");
                lblbook.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblbook.setBackground(new Color(0, 206, 209));
            }
        });
        // author
        lblauthor.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "author");
                lblauthor.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblauthor.setBackground(new Color(0, 206, 209));
            }
        });
        // staff
        lblstaff.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "staff");
                lblstaff.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblstaff.setBackground(new Color(0, 206, 209));
            }
        });
        // publish
        lblpublish.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "publish");
                lblpublish.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblpublish.setBackground(new Color(0, 206, 209));
            }
        });
        // reader
        lblreader.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "reader");
                lblreader.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblreader.setBackground(new Color(0, 206, 209));
            }
        });
        //statistcal
        lblstatis.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "statis");
                lblstatis.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblstatis.setBackground(new Color(0, 206, 209));
            }
        });
        //borrow
        lblborrow.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "borrow");
                lblborrow.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblborrow.setBackground(new Color(0, 206, 209));
            }
        });
        lblimport.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "coupon");
                lblimport.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblimport.setBackground(new Color(0, 206, 209));
            }
        });
        lblBorrowBook.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "borrowBook");
                lblBorrowBook.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblhome.setBackground(new Color(0, 206, 209));
            }
        });
        title();
    }

    public MenuleftGUI(boolean Home, boolean Book, boolean Author, boolean Staff, boolean Reader, boolean Statis, boolean Borrow, boolean Coupon, boolean BorrowBook,boolean Account) {

        setUndecorated(true);
        setBounds(50, 50, 1250, 700);
        contentPane = new JPanel();
        cardlayout = new CardLayout();
        contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);
        contentPane.setBackground(new Color(0, 0, 209));
        setLocationRelativeTo(null);

        // JPanel Home
        panelHome = new JPanel();
        HomeGUI home = new HomeGUI();
        panelHome.setLayout(new BorderLayout());
        panelHome.add(home, BorderLayout.CENTER);
        // JPanel Book
        panelBook = new JPanel();
        BookGUI book = new BookGUI();
        panelBook.setLayout(new BorderLayout());
        panelBook.add(book, BorderLayout.CENTER);
        // Jpanel Author
        panelAuthor = new JPanel();
        AuthorGUI author = new AuthorGUI();
        panelAuthor.setLayout(new BorderLayout());
        panelAuthor.add(author, BorderLayout.CENTER);
        // staff
        panelstaff = new JPanel();
        StaffGUI staff = new StaffGUI();
        panelstaff.setLayout(new BorderLayout());
        panelstaff.add(staff, BorderLayout.CENTER);
        // reader
        panelreader = new JPanel();
        ReaderGUI reader = new ReaderGUI();
        panelreader.setLayout(new BorderLayout());
        panelreader.add(reader, BorderLayout.CENTER);
        //statis
        panelStatis = new JPanel();
//        Statistical_2GUI statis = new Statistical_2GUI();
        Statistical_GUI statis = new Statistical_GUI();
        panelStatis.setLayout(new BorderLayout());
        panelStatis.add(statis, BorderLayout.CENTER);
        // Jpanel Borrow
        panelBorrow = new JPanel();
        BorrowGUI borrow = new BorrowGUI();
        panelBorrow.setLayout(new BorderLayout());
        panelBorrow.add(borrow, BorderLayout.CENTER);
        // Jpanel Coupon
        panelCoupon = new JPanel();
        CouponGUI coupon = new CouponGUI();
        panelCoupon.setLayout(new BorderLayout());
        panelCoupon.add(coupon, BorderLayout.CENTER);

        //Jpanel BorrowBooks
        panelBorrowBooks = new JPanel();
        BorrowBooks borrowBook = new BorrowBooks();
        panelBorrowBooks.setLayout(new BorderLayout());
        panelBorrowBooks.add(borrowBook, BorderLayout.CENTER);
        //JPanel Account
        panelAccount = new JPanel();
        AccountGUI accountGUI = new AccountGUI();
        panelAccount.setLayout(new BorderLayout());
        panelAccount.add(accountGUI, BorderLayout.CENTER);

        JPanel cardPanel = new JPanel(cardlayout);
        cardPanel.add(panelHome, "home");

        cardPanel.add(panelBook, "book");

        cardPanel.add(panelAuthor, "author");

        cardPanel.add(panelstaff, "staff");

        cardPanel.add(panelreader, "reader");

        cardPanel.add(panelStatis, "statis");

        cardPanel.add(panelBorrow, "borrow");

        cardPanel.add(panelCoupon, "coupon");

        cardPanel.add(panelBorrowBooks, "borrowBook");
        cardPanel.add(panelAccount, "accountGUI");

        //create menuleft
        menuleft = new JPanel();
        // Menu bar on the left
        menuleft.setPreferredSize(new Dimension(180, 700));
        menuleft.setBackground(new Color(0, 206, 209));
        contentPane.add(menuleft, BorderLayout.WEST);
        menuleft.setLayout(null);
        menuleft.setBorder(new EmptyBorder(20, 20, 0, 20));

        JPanel panel = new JPanel();
        Border border = BorderFactory.createMatteBorder(20, 20, 0, 0, Color.white);
        panel.setBorder(border);
        panel.setBounds(0, 0, 180, 2);
        menuleft.add(panel);
        // Home
        lblhome = new JLabel("Trang Chủ");
        lblbook = new JLabel("Sách");
        lblauthor = new JLabel("Tác Giả");
        lblstaff = new JLabel("Nhân Viên");
        lblreader = new JLabel("Độc Giả");
        lblstatis = new JLabel("Thống Kê");
        lblborrow = new JLabel("Phiếu Mượn");
        lblimport = new JLabel("Phiếu Nhập");
        lblBorrowBook = new JLabel("Mượn Trả");
        lblAccount = new JLabel("Tài Khoản");

        if (Home) {
            lblhome.setBackground(new Color(64, 64, 64));
            lblhome.setOpaque(true);
            lblhome.setForeground(Color.white);
            lblhome.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblhome.setIcon(new ImageIcon(getClass().getResource("/img/1_home.png")));
            lblhome.setBackground(new Color(0, 206, 209));
            lblhome.setBounds(0, 55, 180, 50);
            lblhome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblhome);
            menuleft.remove(lblBorrowBook);
            menuleft.remove(lblbook);
            menuleft.remove(lblauthor);
            menuleft.remove(lblstaff);
            menuleft.remove(lblborrow);
            menuleft.remove(lblimport);
            menuleft.remove(lblstatis);
            menuleft.remove(lblreader);

        }
        if (BorrowBook) {
            lblBorrowBook.setBackground(new Color(64, 64, 64));
            lblBorrowBook.setOpaque(true);
            lblBorrowBook.setForeground(Color.white);
            lblBorrowBook.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblBorrowBook.setIcon(new ImageIcon(getClass().getResource("/img/10_borrowbook.png")));
            lblBorrowBook.setBackground(new Color(0, 206, 209));
            lblBorrowBook.setBounds(0, 110, 180, 50);
            lblBorrowBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblBorrowBook);
        } else {
            menuleft.remove(lblBorrowBook);
        }
        //book
        if (Book) {
            lblbook.setBackground(new Color(64, 64, 64));
            lblbook.setOpaque(true);
            lblbook.setForeground(Color.white);
            lblbook.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblbook.setIcon(new ImageIcon(getClass().getResource("/img/5_book.png")));
            lblbook.setBackground(new Color(0, 206, 209));
            lblbook.setBounds(0, 165, 180, 50);
            lblbook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblbook);
        } else {
            menuleft.remove(lblhome);
        }

        // author
        if (Author) {

            lblauthor.setBackground(new Color(64, 64, 64));
            lblauthor.setOpaque(true);
            lblauthor.setForeground(Color.white);
            lblauthor.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblauthor.setIcon(new ImageIcon(getClass().getResource("/img/7_author.png")));
            lblauthor.setBackground(new Color(0, 206, 209));
            lblauthor.setBounds(0, 210, 180, 50);
            lblauthor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblauthor);
        } else {
            menuleft.remove(lblauthor);
        }

        // staff nhân viên
        if (Staff) {

            lblstaff.setBackground(new Color(64, 64, 64));
            lblstaff.setOpaque(true);
            lblstaff.setForeground(Color.white);
            lblstaff.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblstaff.setIcon(new ImageIcon(getClass().getResource("/img/4_staff.png")));
            lblstaff.setBackground(new Color(0, 206, 209));
            lblstaff.setBounds(0, 265, 180, 50);
            lblstaff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblstaff);
        } else {
            menuleft.remove(lblstaff);
        }

        // reader
        if (Reader) {

            lblreader.setBackground(new Color(64, 64, 64));
            lblreader.setOpaque(true);
            lblreader.setForeground(Color.white);
            lblreader.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblreader.setIcon(new ImageIcon(getClass().getResource("/img/2_reader.png")));
            lblreader.setBackground(new Color(0, 206, 209));
            lblreader.setBounds(0, 320, 180, 50);
            lblreader.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblreader);

        } else {
            menuleft.remove(lblreader);
        }

        // statis thống kê
        // borrow
        if (Borrow) {

            lblborrow.setBackground(new Color(64, 64, 64));
            lblborrow.setOpaque(true);
            lblborrow.setForeground(Color.white);
            lblborrow.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblborrow.setIcon(new ImageIcon(getClass().getResource("/img/6_borrow.png")));
            lblborrow.setBackground(new Color(0, 206, 209));
            lblborrow.setBounds(0, 375, 180, 50);
            lblborrow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblborrow);

        } else {
            menuleft.remove(lblborrow);
        }

        //import phiếu nhập
        if (Coupon) {

            lblimport.setBackground(new Color(64, 64, 64));
            lblimport.setOpaque(true);
            lblimport.setForeground(Color.white);
            lblimport.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblimport.setIcon(new ImageIcon(getClass().getResource("/img/8_import.png")));
            lblimport.setBackground(new Color(0, 206, 209));
            lblimport.setBounds(0, 430, 180, 50);
            lblimport.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblimport);

        } else {
            menuleft.remove(lblimport);
        }
        //thong ke
        if (Statis) {

            lblstatis.setBackground(new Color(64, 64, 64));
            lblstatis.setOpaque(true);
            lblstatis.setForeground(Color.white);
            lblstatis.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblstatis.setIcon(new ImageIcon(getClass().getResource("/img/4_staff.png")));
            lblstatis.setBackground(new Color(0, 206, 209));
            lblstatis.setBounds(0, 485, 180, 50);
            lblstatis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblstatis);
        } else {
            menuleft.remove(lblstatis);
        }
        if (Account) {
            lblAccount.setBackground(new Color(64, 64, 64));
            lblAccount.setOpaque(true);
            lblAccount.setForeground(Color.white);
            lblAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblAccount.setIcon(new ImageIcon(getClass().getResource("/img/20_account.png")));
            lblAccount.setBackground(new Color(0, 206, 209));
            lblAccount.setBounds(0, 540, 180, 50);
            lblAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            menuleft.add(lblAccount);
        } else {
            menuleft.remove(lblAccount);
        }
        //
        // card layout
        contentPane.add(cardPanel, BorderLayout.CENTER);

        // Home
        lblhome.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "home");
                lblhome.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblhome.setBackground(new Color(0, 206, 209));

            }
        });
        // Book
        lblbook.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "book");
                lblbook.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblbook.setBackground(new Color(0, 206, 209));
            }
        });
        // author
        lblauthor.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "author");
                lblauthor.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblauthor.setBackground(new Color(0, 206, 209));
            }
        });
        // staff
        lblstaff.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "staff");
                lblstaff.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblstaff.setBackground(new Color(0, 206, 209));
            }
        });
        // reader
        lblreader.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "reader");
                lblreader.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblreader.setBackground(new Color(0, 206, 209));
            }
        });
        //statistcal
        lblstatis.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "statis");
                lblstatis.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblstatis.setBackground(new Color(0, 206, 209));
            }
        });
        //borrow
        lblborrow.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "borrow");
                lblborrow.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblborrow.setBackground(new Color(0, 206, 209));
            }
        });
        lblimport.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "coupon");
                lblimport.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblimport.setBackground(new Color(0, 206, 209));
            }
        });
        lblBorrowBook.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "borrowBook");
                lblBorrowBook.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblBorrowBook.setBackground(new Color(0, 206, 209));
            }
        });
         lblAccount.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardlayout.show(cardPanel, "accountGUI");
                lblBorrowBook.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblAccount.setBackground(new Color(0, 206, 209));
            }
        });
        title();
    }

    // thanh menuleft
    public void title() {
        JPanel jPanelTitle = new JPanel(new BorderLayout());

        JLabel jLabelleft = new JLabel("Quản Lý Thư Viện");
        jLabelleft.setFont(new Font("Tahome", Font.ITALIC, 20));
        jLabelleft.setForeground(Color.black);
        jPanelTitle.add(jLabelleft, BorderLayout.WEST);

        jLabelright = new JLabel();
        jLabelright.setIcon(new ImageIcon(getClass().getResource("/img/black.png")));
        jLabelright.setForeground(Color.WHITE);
        jLabelright.setFont(new Font("tahome", Font.BOLD, 20));
        jPanelTitle.add(jLabelright, BorderLayout.EAST);

        jPanelTitle.setBorder(new EmptyBorder(0, 10, 0, 10));
        jPanelTitle.setBackground(new Color(0, 206, 209));
        jPanelTitle.setPreferredSize(new Dimension(180, 40));
        contentPane.add(jPanelTitle, BorderLayout.NORTH);
        // thoát
        jLabelright.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MenuleftGUI m = new MenuleftGUI();
                    m.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }
}
