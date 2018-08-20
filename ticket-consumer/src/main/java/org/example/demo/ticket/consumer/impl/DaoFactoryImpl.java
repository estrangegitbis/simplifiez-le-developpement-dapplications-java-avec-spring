package org.example.demo.ticket.consumer.impl;

import org.example.demo.ticket.consumer.contract.DaoFactory;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;

import javax.inject.Inject;
import javax.inject.Named;

@Named("DaoFactory")
public class DaoFactoryImpl implements DaoFactory {
    @Inject
    private ProjetDao projetDao;

    @Override
    public ProjetDao getProjetDao(){
        return projetDao;
    }

    @Override
    public void setProjetDao(ProjetDao projetManager){
        this.projetDao = projetDao;
    }

    @Inject
    private TicketDao ticketDao;

    @Override
    public TicketDao getTicketDao(){
        return ticketDao;
    }

    @Override
    public void setTicketDao(TicketDao ticketManager){
        this.ticketDao = ticketDao;
    }


    @Inject
    private UtilisateurDao utilisateurDao;

    @Override
    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }

    @Override
    public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }
}
