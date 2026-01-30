import { Injectable } from '@angular/core';
import { BadgeService } from './BadgeAttribution';
import { DriverService } from './DriverService';

@Injectable({
  providedIn: 'root',
})
export class RestServer {
  constructor(
    private badgeService: BadgeService,
    private driverService: DriverService
  ) {}

  getBadgeService(): BadgeService {
    return this.badgeService;
  }

  getDriverService(): DriverService {
    return this.driverService;
  }
}
